import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  renderGuestPage() {
    return (
      <div>
        <h2>Welcome Guest!</h2>
        <p>You can only browse flight details.</p>
        <button onClick={this.handleLogin}>Login</button>
        <FlightDetails />
      </div>
    );
  }

  renderUserPage() {
    return (
      <div>
        <h2>Welcome User!</h2>
        <p>You can book your flight tickets.</p>
        <button onClick={this.handleLogout}>Logout</button>
        <FlightDetails />
        <BookTicket />
      </div>
    );
  }

  render() {
    let pageContent;

    // Element Variable for conditional rendering
    if (this.state.isLoggedIn) {
      pageContent = this.renderUserPage();
    } else {
      pageContent = this.renderGuestPage();
    }

    return (
      <div className="App">
        <h1>Flight Ticket Booking App</h1>
        {pageContent}
      </div>
    );
  }
}

// Reusable Components
function FlightDetails() {
  return (
    <div>
      <h3>Available Flights</h3>
      <ul>
        <li>Flight A - Delhi to Mumbai</li>
        <li>Flight B - Chennai to Bangalore</li>
        <li>Flight C - Kolkata to Hyderabad</li>
      </ul>
    </div>
  );
}

function BookTicket() {
  return (
    <div>
      <h3>Book Your Ticket</h3>
      <p>[Ticket booking form would be here]</p>
    </div>
  );
}

export default App;
