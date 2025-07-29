import React from 'react';

function CourseDetails() {
  const courses = [
    { id: 'C01', name: 'React for Beginners', duration: '4 Weeks' },
    { id: 'C02', name: 'Advanced React', duration: '6 Weeks' }
  ];

  return (
    <div>
      <h2>🎓 Course Details</h2>
      {courses.length > 0 ? (
        <ul>
          {courses.map(course => (
            <li key={course.id}>
              {course.name} - Duration: {course.duration}
            </li>
          ))}
        </ul>
      ) : (
        <p>No courses available right now.</p>
      )}
    </div>
  );
}

export default CourseDetails;
