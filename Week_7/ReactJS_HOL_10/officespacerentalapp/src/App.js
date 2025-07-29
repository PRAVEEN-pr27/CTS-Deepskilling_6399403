import React from 'react';

function App() {
  const headingStyle = {
    textAlign: 'center',
    color: '#333',
    marginBottom: '20px'
  };

  const imageStyle = {
    width: '100%',
    maxWidth: '600px',
    height: 'auto',
    borderRadius: '8px'
  };

  const officeSpaces = [
    {
      name: 'Sky Tower Offices',
      rent: 45000,
      address: 'Plot 12, Tech Park, Bangalore',
      image: 'https://via.placeholder.com/600x300?text=Sky+Tower+Offices'
    },
    {
      name: 'GreenTech Plaza',
      rent: 65000,
      address: 'Main Street, Hyderabad',
      image: 'https://via.placeholder.com/600x300?text=GreenTech+Plaza'
    },
    {
      name: 'UrbanHub Workspaces',
      rent: 55000,
      address: 'Phase 2, Pune IT Zone',
      image: 'https://via.placeholder.com/600x300?text=UrbanHub+Workspaces'
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1 style={headingStyle}>Office Space Rental Listings</h1>

      {officeSpaces.map((office, index) => (
        <div key={index} style={{ marginBottom: '30px' }}>
          <img src={office.image} alt={office.name} style={imageStyle} />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;
