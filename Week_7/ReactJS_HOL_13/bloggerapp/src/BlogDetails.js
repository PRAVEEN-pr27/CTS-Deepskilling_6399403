import React from 'react';

function BlogDetails() {
  const blogs = [
    { id: 101, topic: 'React Hooks', writer: 'Sophie Alpert' },
    { id: 102, topic: 'Conditional Rendering', writer: 'Ryan Florence' }
  ];

  return (
    <div>
      <h2>📝 Blog Details</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>
            <em>{blog.topic}</em> — by {blog.writer}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BlogDetails;
