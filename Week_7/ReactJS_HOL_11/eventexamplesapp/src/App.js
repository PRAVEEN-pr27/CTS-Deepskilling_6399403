import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
    this.sayHello();
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  sayHello = () => {
    alert('Hello! Have a great day.');
  };

  handleWelcome = (message) => {
    alert(message);
  };

  handleSynthetic = (event) => {
    alert('I was clicked');
    console.log('Synthetic Event:', event);
  };

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>React Event Handling Example</h1>
        
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increase</button>
        <button onClick={this.decrement}>Decrease</button>
        
        <hr />

        <button onClick={() => this.handleWelcome('Welcome to React Events!')}>
          Say Welcome
        </button>

        <hr />

        <button onClick={this.handleSynthetic}>
          Synthetic Event Button
        </button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
