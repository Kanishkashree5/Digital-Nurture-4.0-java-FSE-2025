import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('books');

  const books = [
    { title: "React in Action", author: "Mark T." },
    { title: "Learning JavaScript", author: "Ethan Brown" }
  ];

  const blogs = [
    { title: "Why React is Powerful", description: "React allows fast UI development..." },
    { title: "Hooks Simplified", description: "UseState and UseEffect are powerful tools..." }
  ];

  const courses = [
    { id: 1, name: "React Basics", instructor: "John Doe" },
    { id: 2, name: "Advanced React", instructor: "Jane Smith" }
  ];

  let content;

  // Conditional rendering using if-else
  if (view === 'books') {
    content = <BookDetails books={books} />;
  } else if (view === 'blogs') {
    content = <BlogDetails blogs={blogs} />;
  } else if (view === 'courses') {
    content = <CourseDetails courses={courses} />;
  } else {
    content = <p>No view selected.</p>;
  }

  return (
    <div className="App">
      <h1>Blogger Dashboard</h1>

      {/* Conditional Rendering with Ternary */}
      <div>
        <button onClick={() => setView('books')}>Show Books</button>
        <button onClick={() => setView('blogs')}>Show Blogs</button>
        <button onClick={() => setView('courses')}>Show Courses</button>
      </div>

      <hr />
      {content}
    </div>
  );
}

export default App;
