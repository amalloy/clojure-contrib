(ns clojure.contrib.test-prxml
  (:use clojure.test clojure.contrib.prxml))

(deftest prxml-basic
  (is (= "<p id=\"test\">Hello, World!</p>"
         (with-out-str (prxml [:p {:id "test"} "Hello, World!"])))))

(deftest prxml-escaping
  (is (= "<a href=\"foo&amp;bar\">foo&lt;bar</a>"
         (with-out-str (prxml [:a {:href "foo&bar"} "foo<bar"])))))

(deftest prxml-pprint
  (is (= "
<ol>
    <li>1
    </li>
</ol>"
         (binding [*prxml-indent* 4]
           (with-out-str
             (prxml [:ol [:li 1]]))))))
