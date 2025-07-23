import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        Name="John Doe"
        School="National High School"
        Total={440}
        Goal={500}
      />
    </div>
  );
}

export default App;
