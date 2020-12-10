FROM clojure

COPY project.clj .
COPY src src
COPY test test

CMD [ "lein", "test" ]
