import React from 'react';

function UserPage({ onLogout }) {
  return (
    <div>
      <h2>Welcome Back, User!</h2>
      <p>You are now able to book flight tickets.</p>
      <button onClick={onLogout}>Logout</button>

      <div style={{ marginTop: '20px' }}>
        <h3>Book Your Flight</h3>
        <ul>
          <li>✈️ Chennai → Mumbai - ₹4,000 <button>Book</button></li>
          <li>✈️ Delhi → Bangalore - ₹3,800 <button>Book</button></li>
          <li>✈️ Hyderabad → Kolkata - ₹4,200 <button>Book</button></li>
        </ul>
      </div>
    </div>
  );
}

export default UserPage;
