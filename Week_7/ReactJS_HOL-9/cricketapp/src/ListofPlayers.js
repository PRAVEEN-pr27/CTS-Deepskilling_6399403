import React from 'react';

function ListofPlayers() {
  const players = [
    { name: 'Virat Kohli', score: 90 },
    { name: 'Rohit Sharma', score: 85 },
    { name: 'Shikhar Dhawan', score: 60 },
    { name: 'KL Rahul', score: 75 },
    { name: 'Rishabh Pant', score: 45 },
    { name: 'Hardik Pandya', score: 80 },
    { name: 'Jadeja', score: 65 },
    { name: 'Shami', score: 50 },
    { name: 'Bumrah', score: 55 },
    { name: 'Ashwin', score: 95 },
    { name: 'Suryakumar Yadav', score: 88 }
  ];

  const highScorers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>Players Scoring 70 or More</h2>
      <ul>
        {highScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
