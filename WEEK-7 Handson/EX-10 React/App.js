import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      name: "Tech Hub",
      rent: 55000,
      address: "123 Silicon Street",
      image: "https://via.placeholder.com/300x200?text=Tech+Hub"
    },
    {
      name: "Innovate Space",
      rent: 75000,
      address: "45 Innovation Avenue",
      image: "https://via.placeholder.com/300x200?text=Innovate+Space"
    },
    {
      name: "WorkNest",
      rent: 60000,
      address: "89 Startup Lane",
      image: "https://via.placeholder.com/300x200?text=WorkNest"
    }
  ];

  const rentStyle = (rent) => ({
    color: rent > 60000 ? "green" : "red",
    fontWeight: 'bold'
  });

  return (
    <div className="App">
      <h1>Office Space Rental Listings</h1>
      {offices.map((office, index) => (
        <div key={index} style={{ border: '1px solid gray', padding: '15px', margin: '15px', borderRadius: '10px' }}>
          <img src={office.image} alt={office.name} width="300" height="200" />
          <h2>{office.name}</h2>
          <p style={rentStyle(office.rent)}>Rent: ₹{office.rent}</p>
          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
