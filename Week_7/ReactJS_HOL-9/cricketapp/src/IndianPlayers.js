import React from 'react';

function IndianPlayers() {
  const oddTeam = ['Virat', 'Rohit', 'Pant', 'Hardik', 'Bumrah'];
  const evenTeam = ['Dhawan', 'Rahul', 'Jadeja', 'Shami', 'Ashwin'];

  // Destructuring teams
  const [firstOdd, ...restOdd] = oddTeam;
  const [firstEven, ...restEven] = evenTeam;

  const T20players = ['Rohit', 'Surya', 'Pant'];
  const RanjiPlayers = ['Rahane', 'Pujara'];

  // Merging arrays using spread operator
  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team</h2>
      <p>Captain: {firstOdd}</p>
      <ul>
        {restOdd.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team</h2>
      <p>Captain: {firstEven}</p>
      <ul>
        {restEven.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Combined T20 and Ranji Players</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
