import '../Stylesheets/mystyle.css';

function calculatePercentage(total, goal) {
  return ((total / goal) * 100).toFixed(2) + '%';
}

const CalculateScore = ({ Name, School, Total, Goal }) => {
  return (
    <div className="score-card">
      <h2>Student Score Report</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total Marks:</strong> {Total}</p>
      <p><strong>Goal:</strong> {Goal}</p>
      <p><strong>Average:</strong> {calculatePercentage(Total, Goal)}</p>
    </div>
  );
};

export default CalculateScore;
