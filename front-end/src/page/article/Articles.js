import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

const Articles = () => {
    const [articles, setArticles] = useState([]);

    useEffect(() => {
        fetch(`http://localhost:8080/articles`)
        .then((response) => response.json())
        .then((data) => setArticles(data));
    }, []);



    return (
        <section>
            <h2>Articles</h2>
            <ul>
                {articles.map((article) => (
                    <li key={article.id}>
                        <Link to={`/articles/${article.id}`}>{article.name}</Link>
                    </li>
                ))}
            </ul>
        </section>
    );
};

export default Articles;
