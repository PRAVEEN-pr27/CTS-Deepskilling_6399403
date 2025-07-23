import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ name, track, status }) => {
  const titleStyle = {
    color: status === 'ongoing' ? 'green' : 'blue',
  };

  return (
    <div className={styles.box}>
      <h3 style={titleStyle}>{name}</h3>
      <dl>
        <dt>Track</dt>
        <dd>{track}</dd>
        <dt>Status</dt>
        <dd>{status}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
