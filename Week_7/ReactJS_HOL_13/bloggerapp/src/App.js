import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [currentView, setCurrentView] = useState('');

  const renderContent = () => {
    switch (currentView) {
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      case 'courses':
        return <CourseDetails />;
      default:
        return <p>Please select a category to view details.</p>;
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App Dashboard</h1>
      <div style={{ marginBottom: '10px' }}>
        <button onClick={() => setCurrentView('books')}>Book Details</button>
        <button onClick={() => setCurrentView('blogs')}>Blog Details</button>
        <button onClick={() => setCurrentView('courses')}>Course Details</button>
      </div>

      {/* Conditional Rendering */}
      {currentView && renderContent()}
    </div>
  );
}

export default App;
