import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const ArticleDetail = (props) => {
    const [article, setArticle] = useState({});
    const {id} = useParams();

    useEffect(() => {
        fetch(`http://localhost:8080/articles/${id}`)
        .then((response) => response.json())
        .then((data) => setArticle(data));
    }, [id]);


    return (
        <section>
            <p>article id: {article.id}</p>
            <p>article name: {article.name}</p>
        </section>
    );
};

export default ArticleDetail;