import React from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./page/Home";
import About from "./page/About";
import User from "./page/User";
import Welcome from "./page/welcome";
import ArticleDetail from "./page/article/ArticleDetail";
import Articles from "./page/article/Articles";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <nav>
          <ul>
            <li>
              <Link to={"/"}>Home</Link>
            </li>
            <li>
              <Link to={"/about"}>About</Link>
            </li>
            <li>
              <Link to={"/user"}>User</Link>
            </li>
            <li>
              <Link to={"/articles"}>articles</Link>
            </li>
            <li>
              <Link to={"/welcome"}>welcome</Link>
            </li>
          </ul>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/user" element={<User />} />
          <Route path="/articles" element={<Articles />} />
          <Route path="/articles/:id" element={<ArticleDetail />} />
          <Route path="*" element={<Welcome />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
