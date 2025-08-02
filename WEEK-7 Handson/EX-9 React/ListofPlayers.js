// src/ListofPlayers.js
import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 90 },
    { name: 'Rohit', score: 80 },
    { name: 'Dhoni', score: 95 },
    { name: 'Jadeja', score: 65 },
    { name: 'Ashwin', score: 50 },
    { name: 'Pant', score: 88 },
    { name: 'Bumrah', score: 60 },
    { name: 'Gill', score: 72 },
    { name: 'Hardik', score: 30 },
    { name: 'KL Rahul', score: 78 },
    { name: 'Shami', score: 55 }
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
