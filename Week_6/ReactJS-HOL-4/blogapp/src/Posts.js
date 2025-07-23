import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((res) => res.json())
      .then((data) => this.setState({ posts: data.slice(0, 10) }))
      .catch((error) => {
        console.error('Fetch error:', error);
        this.setState({ hasError: true });
      });
  }

  componentDidCatch(error, info) {
    alert("Something went wrong in the component.");
    console.error("Caught error:", error, info);
    this.setState({ hasError: true });
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h2>Unable to load posts. Please try again later.</h2>;
    }

    return (
      <div style={{ padding: 20 }}>
        <h2>Blog Posts</h2>
        {posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
