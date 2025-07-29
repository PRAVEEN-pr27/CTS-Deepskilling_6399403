import React from 'react';

function GuestPage({ onLogin }) {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>You can browse available flights, but booking requires login.</p>
      <button onClick={onLogin}>Login</button>

      <div style={{ marginTop: '20px' }}>
        <h3>Available Flights</h3>
        <ul>
          <li>✈️ Chennai → Mumbai - 8:00 AM</li>
          <li>✈️ Delhi → Bangalore - 11:30 AM</li>
          <li>✈️ Hyderabad → Kolkata - 4:45 PM</li>
        </ul>
      </div>
    </div>
  );
}

export default GuestPage;
