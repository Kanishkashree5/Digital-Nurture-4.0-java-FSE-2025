// src/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Dhoni', 'Jadeja', 'Ashwin', 'Pant', 'Bumrah', 'Gill'];
  
  // Destructuring example: odd/even players
  const oddPlayers = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 === 0);

  // Merging two arrays
  const T20players = ['Surya', 'Arshdeep'];
  const RanjiTrophyPlayers = ['Unadkat', 'Pujara'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Index Players:</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Index Players:</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 and Ranji Players:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
