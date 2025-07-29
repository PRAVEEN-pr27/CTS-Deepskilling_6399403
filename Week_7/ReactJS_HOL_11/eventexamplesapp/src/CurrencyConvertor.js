import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = () => {
    const conversionRate = 0.011; // 1 INR ≈ 0.011 EUR
    const result = (parseFloat(rupees) * conversionRate).toFixed(2);
    setEuro(result);
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <input
        type="number"
        placeholder="Enter amount in ₹"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>

      {euro && <p>Equivalent in Euro: €{euro}</p>}
    </div>
  );
}

export default CurrencyConvertor;
