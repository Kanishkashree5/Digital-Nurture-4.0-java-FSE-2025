import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
      rupees: '',
      euro: ''
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    alert("Hello! This is a static message.");
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleClick = (event) => {
    alert("I was clicked!");
    console.log("Synthetic Event Object:", event); // SyntheticEvent logged in console
  };

  handleInputChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = () => {
    const rupees = parseFloat(this.state.rupees);
    if (isNaN(rupees)) {
      alert("Please enter a valid number");
      return;
    }
    const euro = (rupees / 90).toFixed(2); // Approximate conversion
    this.setState({ euro });
  };

  render() {
    return (
      <div className="App">
        <h1>Event Handling Example</h1>
        
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <hr />

        <button onClick={() => this.sayWelcome("Welcome!")}>Say Welcome</button>

        <hr />

        <button onClick={this.handleClick}>Click Me</button>

        <hr />

        <h2>Currency Converter</h2>
        <input
          type="text"
          placeholder="Enter amount in Rupees"
          value={this.state.rupees}
          onChange={this.handleInputChange}
        />
        <button onClick={this.handleSubmit}>Convert</button>
        {this.state.euro && <p>Converted Euro: €{this.state.euro}</p>}
      </div>
    );
  }
}

export default App;
