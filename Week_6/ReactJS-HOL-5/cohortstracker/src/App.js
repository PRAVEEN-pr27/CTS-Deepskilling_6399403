import React from 'react';
import CohortDetails from './Components/CohortDetails';


function App() {
  return (
    <div className="App">
      <h2>My Academy Cohorts</h2>
      <CohortDetails name="React Mastery" track="Frontend" status="ongoing" />
      <CohortDetails name="Spring Boot" track="Backend" status="completed" />
    </div>
  );
}

export default App;

