{:namespaces
 ({:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/accumulators-api.html",
   :name "clojure.contrib.accumulators",
   :author "Konrad Hinsen",
   :doc
   "A generic accumulator interface and implementations of various\naccumulators."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/agent_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/agent-utils-api.html",
   :name "clojure.contrib.agent-utils",
   :author "Christophe Grande",
   :doc
   "Miscellaneous agent utilities\n(note to other contrib members: feel free to add to this lib)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/73accf597eafb8dfcb642702a3b98b057bbdbbdf/src/main/clojure/clojure/contrib/apply_macro.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/apply-macro-api.html",
   :name "clojure.contrib.apply-macro",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/base64.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/base64-api.html",
   :name "clojure.contrib.base64",
   :author "Stuart Sierra",
   :doc
   "Base-64 encoding and (maybe later) decoding.  \n\nThis is mainly here as an example.  It is much slower than the\nApache Commons Codec implementation or sun.misc.BASE64Encoder."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/classpath.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/classpath-api.html",
   :name "clojure.contrib.classpath",
   :author "Stuart Sierra",
   :doc "Utilities for dealing with the JVM's classpath"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/combinatorics-api.html",
   :name "clojure.contrib.combinatorics",
   :author "Mark Engelberg",
   :doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/command_line.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/command-line-api.html",
   :name "clojure.contrib.command-line",
   :author "Chris Houser",
   :doc "Process command-line arguments according to a given cmdspec"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/complex_numbers.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/complex-numbers-api.html",
   :name "clojure.contrib.complex-numbers",
   :author "Konrad Hinsen",
   :doc
   "Complex numbers\nNOTE: This library is in evolution. Most math functions are\n      not implemented yet."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/cond.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/cond-api.html",
   :name "clojure.contrib.cond",
   :author "Stephen C. Gilardi",
   :doc "Extensions to the basic cond function."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/condition-api.html",
   :name "clojure.contrib.condition",
   :author "Stephen C. Gilardi",
   :doc
   "Flexible raising and handling of conditions:\n\nFunctions:\n\n              raise: raises a condition\n       handler-case: dispatches raised conditions to appropriate handlers\n  print-stack-trace: prints abbreviated or full condition stack traces\n\nData:\n\n  A condition is a map containing values for these keys:\n\n    - :type, a condition type specifier, typically a keyword\n    - :stack-trace, a stack trace to the site of the raise\n    - :message, a human-readable message (optional)\n    - :cause, a wrapped exception or condition (optional)\n    - other keys given as arguments to raise (optional)\n\nNote: requires AOT compilation.\n\nBased on an idea from Chouser:\nhttp://groups.google.com/group/clojure/browse_frm/thread/da1285c538f22bb5"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/core-api.html",
   :name "clojure.contrib.core",
   :author "Laurent Petit (and others)",
   :doc
   "Functions/macros variants of the ones that can be found in clojure.core \n(note to other contrib members: feel free to add to this lib)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/dataflow-api.html",
   :name "clojure.contrib.dataflow",
   :author "Jeffrey Straszheim",
   :doc "A library to support a dataflow model of state"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog-api.html",
   :name "clojure.contrib.datalog",
   :author "Jeffrey Straszheim",
   :doc "A Clojure implementation of Datalog"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/def-api.html",
   :name "clojure.contrib.def",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/duck-streams-api.html",
   :name "clojure.contrib.duck-streams",
   :author "Stuart Sierra",
   :doc
   "This file defines \"duck-typed\" I/O utility functions for Clojure.\nThe 'reader' and 'writer' functions will open and return an\ninstance of java.io.BufferedReader and java.io.PrintWriter,\nrespectively, for a variety of argument types -- filenames as\nstrings, URLs, java.io.File's, etc.  'reader' even works on http\nURLs.\n\nNote: this is not really \"duck typing\" as implemented in languages\nlike Ruby.  A better name would have been \"do-what-I-mean-streams\"\nor \"just-give-me-a-stream\", but ducks are funnier."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/error-kit-api.html",
   :name "clojure.contrib.error-kit",
   :author "Chris Houser",
   :doc
   "EXPERIMENTAL\nSystem for defining and using custom errors\nPlease contact Chouser if you have any suggestions for better names\nor API adjustments."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/except.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/except-api.html",
   :name "clojure.contrib.except",
   :author "Stephen C. Gilardi",
   :doc
   "Provides functions that make it easy to specify the class, cause, and\nmessage when throwing an Exception or Error. The optional message is\nformatted using clojure.core/format."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/fcase-api.html",
   :name "clojure.contrib.fcase",
   :author "Stuart Sierra",
   :doc
   "This file defines a generic \"case\" macro called \"fcase\" which takes\nthe equality-testing function as an argument.  It also defines a\ntraditional \"case\" macro that tests using \"=\" and variants that\ntest for regular expressions and class membership.\n\n\nNote (December 23, 2008): This library has been supplanted by the\ninclusion of \"condp\" in clojure.core as of Clojure SVN rev. 1180."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/find-namespaces-api.html",
   :name "clojure.contrib.find-namespaces",
   :author "Stuart Sierra",
   :doc "Search for ns declarations in dirs, JARs, or CLASSPATH"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fnmap.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/fnmap-api.html",
   :name "clojure.contrib.fnmap",
   :author "Stuart Sierra",
   :doc
   "Maps that dispatch get/assoc to user-defined functions.\n\nNote: requires AOT-compilation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/gen_html_docs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/gen-html-docs-api.html",
   :name "clojure.contrib.gen-html-docs",
   :author "Craig Andera",
   :doc
   "Generates a single HTML page that contains the documentation for\none or more Clojure libraries."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.arithmetic-api.html",
   :name "clojure.contrib.generic.arithmetic",
   :author "Konrad Hinsen",
   :doc
   "Generic arithmetic interface\nThis library defines generic versions of + - * / as multimethods\nthat can be defined for any type. The minimal required \nimplementations for a type are binary + and * plus unary - and /.\nEverything else is derived from these automatically. Explicit\nbinary definitions for - and / can be provided for\nefficiency reasons."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.collection-api.html",
   :name "clojure.contrib.generic.collection",
   :author "Konrad Hinsen",
   :doc
   "Generic arithmetic interface\nThis library defines generic versions of common\ncollection-related functions as multimethods that can be\ndefined for any type."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.comparison-api.html",
   :name "clojure.contrib.generic.comparison",
   :author "Konrad Hinsen",
   :doc
   "Generic comparison interface\nThis library defines generic versions of = < > <= >= zero?\nas multimethods that can be defined for any type. Of the\ngreater/less-than relations, types must minimally implement >."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/functor.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.functor-api.html",
   :name "clojure.contrib.generic.functor",
   :author "Konrad Hinsen",
   :doc "Generic functor interface (fmap)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/generic.math-functions-api.html",
   :name "clojure.contrib.generic.math-functions",
   :author "Konrad Hinsen",
   :doc
   "Generic math function interface\nThis library defines generic versions of common mathematical\nfunctions such as sqrt or sin as multimethods that can be\ndefined for any type."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/graph-api.html",
   :name "clojure.contrib.graph",
   :author "Jeffrey Straszheim",
   :doc "Basic graph theory algorithms"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/greatest-least-api.html",
   :name "clojure.contrib.greatest-least",
   :author "Vincent Foley",
   :doc
   "Various functions for finding greatest and least values in a collection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/http.agent-api.html",
   :name "clojure.contrib.http.agent",
   :author "Stuart Sierra",
   :doc
   "Agent-based asynchronous HTTP client.\n\nThis is a HTTP client library based on Java's HttpURLConnection\nclass and Clojure's Agent system.  It allows you to make multiple\nHTTP requests in parallel.\n\nStart an HTTP request with the 'http-agent' function, which\nimmediately returns a Clojure Agent.  You will never deref this\nagent; that is handled by the accessor functions.  The agent will\nexecute the HTTP request on a separate thread.\n\nIf you pass a :handler function to http-agent, that function will be\ncalled as soon as the HTTP response body is ready.  The handler\nfunction is called with one argument, the HTTP agent itself.  The\nhandler can read the response body by calling the 'stream' function\non the agent.\n\nThe value returned by the handler function becomes part of the state\nof the agent, and you can retrieve it with the 'result' function.\nIf you call 'result' before the HTTP request has finished, it will\nblock until the handler function returns.\n\nIf you don't provide a handler function, the default handler will\nbuffer the entire response body in memory, which you can retrieve\nwith the 'bytes', 'string', or 'stream' functions.  Like 'result',\nthese functions will block until the HTTP request is completed.\n\nIf you want to check if an HTTP request is finished without\nblocking, use the 'done?' function.\n\nA single GET request could be as simple as:\n\n  (string (http-agent \"http://www.stuartsierra.com/\"))\n\nA simple POST might look like:\n\n  (http-agent \"http...\" :method \"POST\" :body \"foo=1\")\n\nAnd you could write the response directly to a file like this:\n\n  (require '[clojure.contrib.io :as d])\n\n  (http-agent \"http...\"\n              :handler (fn [agnt] \n                         (with-open [w (d/writer \"/tmp/out\")] \n                           (d/copy (stream agnt) w))))"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/connection.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/http.connection-api.html",
   :name "clojure.contrib.http.connection",
   :doc "Low-level HTTP client API around HttpURLConnection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/import_static.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/import-static-api.html",
   :name "clojure.contrib.import-static",
   :author "Stuart Sierra",
   :doc "Import static Java methods/fields into Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/io-api.html",
   :name "clojure.contrib.io",
   :author "Stuart Sierra",
   :doc
   "This file defines polymorphic I/O utility functions for Clojure.\n\nThe Streams protocol defines reader, writer, input-stream and\noutput-stream methods that return BufferedReader, BufferedWriter,\nBufferedInputStream and BufferedOutputStream instances (respectively),\nwith default implementations extended to a variety of argument\ntypes: URLs or filenames as strings, java.io.File's, Sockets, etc."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jar.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/jar-api.html",
   :name "clojure.contrib.jar",
   :author "Stuart Sierra",
   :doc "Utilities for working with Java JAR files"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/java-utils-api.html",
   :name "clojure.contrib.java-utils",
   :author
   "Stuart Halloway, Stephen C. Gilardi, Shawn Hoover, Perry Trolard, Stuart Sierra",
   :doc
   "A set of utilties for dealing with Java stuff like files and properties.\n\nDesign goals:\n\n(1) Ease-of-use. These APIs should be convenient. Performance is secondary.\n\n(2) Duck typing. I hate having to think about the difference between\n    a string that names a file, and a File. Ditto for a ton of other \n    wrapper classes in the Java world (URL, InternetAddress). With these\n    APIs you should be able to think about domain equivalence, not type\n    equivalence.\n\n(3) No bossiness. I am not marking any of these functions as private\n    the docstrings will tell you the intended usage but do what works for you. \t\t\t\t\t\n\nFeedback welcome!\n\nIf something in this module violates the principle of least surprise, please \nlet me (Stu) and the Clojure community know via the mailing list.\nContributors:\n\nStuart Halloway\nStephen C. Gilardi\nShawn Hoover\nPerry Trolard\nStuart Sierra"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7b29eaf7de0d042a9fedc837322c449fa7a03c7e/src/main/clojure/clojure/contrib/javadoc/browse.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/javadoc.browse-api.html",
   :name "clojure.contrib.javadoc.browse",
   :author "Christophe Grand",
   :doc "Start a web browser from Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/jmx-api.html",
   :name "clojure.contrib.jmx",
   :author "Stuart Halloway",
   :doc
   "JMX support for Clojure\n\nRequires post-Clojure 1.0 git edge for clojure.test, clojure.backtrace.\nThis is prerelease.\nThis API will change.\nSend reports to stu@thinkrelevance.com.\n\nUsage\n  (require '[clojure.contrib.jmx :as jmx])\n\nWhat beans do I have?\n\n  (jmx/mbean-names \"*:*\")\n  -> #<HashSet [java.lang:type=MemoryPool,name=CMS Old Gen, \n                java.lang:type=Memory, ...]\n\nWhat attributes does a bean have?\n\n  (jmx/attribute-names \"java.lang:type=Memory\")\n  -> (:Verbose :ObjectPendingFinalizationCount \n      :HeapMemoryUsage :NonHeapMemoryUsage)\n\nWhat is the value of an attribute? \n\n  (jmx/read \"java.lang:type=Memory\" :ObjectPendingFinalizationCount)\n  -> 0\n\nCan't I just have *all* the attributes in a Clojure map?\n\n  (jmx/mbean \"java.lang:type=Memory\")\n  -> {:NonHeapMemoryUsage\n       {:used 16674024, :max 138412032, :init 24317952, :committed 24317952},\n      :HeapMemoryUsage\n       {:used 18619064, :max 85393408, :init 0, :committed 83230720},\n      :ObjectPendingFinalizationCount 0,\n      :Verbose false}\n\nCan I find and invoke an operation?\n\n  (jmx/operation-names \"java.lang:type=Memory\")\n  -> (:gc)  \n  (jmx/invoke \"java.lang:type=Memory\" :gc)\n  -> nil\n\nWhat about some other process? Just run *any* of the above code\ninside a with-connection:\n\n  (jmx/with-connection {:host \"localhost\", :port 3000} \n    (jmx/mbean \"java.lang:type=Memory\"))\n  -> {:ObjectPendingFinalizationCount 0, \n      :HeapMemoryUsage ... etc.}\n\nCan I serve my own beans?  Sure, just drop a Clojure ref\ninto an instance of clojure.contrib.jmx.Bean, and the bean\nwill expose read-only attributes for every key/value pair\nin the ref:\n\n  (jmx/register-mbean\n     (Bean.\n     (ref {:string-attribute \"a-string\"}))\n     \"my.namespace:name=Value\")"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/json.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/json-api.html",
   :name "clojure.contrib.json",
   :author "Stuart Sierra",
   :doc
   "JavaScript Object Notation (JSON) parser/writer.\nSee http://www.json.org/\nTo write JSON, use json-str, write-json, or write-json.\nTo read JSON, use read-json."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/lazy-seqs-api.html",
   :name "clojure.contrib.lazy-seqs",
   :author "Stephen C. Gilardi",
   :doc
   "\n==== Lazy sequences ====\n\n primes - based on the \"naive\" implemention described in [1] plus a\n          small \"wheel\" which eliminates multiples of 2, 3, 5, and\n          7 from consideration by incrementing past them. Also inspired\n          by code from Christophe Grand in [2].\n\n fibs   - all the Fibonacci numbers\n\n powers-of-2 - all the powers of 2\n\n ==== Lazy sequence functions ====\n\n (partition-all, shuffle moved to clojure.core)\n (rand-elt moved to clojure.core/rand-nth)\n (rotations, rand-elt  moved to seq_utils.clj)\n (permutations and combinations moved to combinatorics.clj)\n\n [1] http://www.cs.hmc.edu/~oneill/papers/Sieve-JFP.pdf\n [2] http://clj-me.blogspot.com/2008/06/primes.html"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/lazy-xml-api.html",
   :name "clojure.contrib.lazy-xml",
   :author "Chris Houser",
   :doc "Functions to parse xml lazily and emit back to text."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/logging-api.html",
   :name "clojure.contrib.logging",
   :author "Alex Taggart, Timothy Pratley",
   :doc
   "Logging macros which delegate to a specific logging implementation. At\nruntime a specific implementation is selected from, in order, Apache\ncommons-logging, log4j, and finally java.util.logging.\n\nLogging levels are specified by clojure keywords corresponding to the\nvalues used in log4j and commons-logging:\n  :trace, :debug, :info, :warn, :error, :fatal\n\nLogging occurs with the log macro, or the level-specific convenience macros,\nwhich write either directly or via an agent.  For performance reasons, direct\nlogging is enabled by default, but setting the *allow-direct-logging* boolean\natom to false will disable it. If logging is invoked within a transaction it\nwill always use an agent.\n\nThe log macros will not evaluate their 'message' unless the specific logging\nlevel is in effect. Alternately, you can use the spy macro when you have code\nthat needs to be evaluated, and also want to output the code and its result to\nthe debug log.\n\nUnless otherwise specified, the current namespace (as identified by *ns*) will\nbe used as the log-ns (similar to how the java class name is usually used).\nNote: your log configuration should display the name that was passed to the\nlogging implementation, and not perform stack-inspection, otherwise you'll see\nsomething like \"fn__72$impl_write_BANG__39__auto____81\" in your logs.\n\nUse the enabled? macro to write conditional code against the logging level\n(beyond simply whether or not to call log, which is handled automatically).\n\nYou can redirect all java writes of System.out and System.err to the log\nsystem by calling log-capture!.  To rebind *out* and *err* to the log system\ninvoke with-logs.  In both cases a log-ns (e.g., \"com.example.captured\")\nneeds to be specified to namespace the output."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/macro-utils-api.html",
   :name "clojure.contrib.macro-utils",
   :author "Konrad Hinsen",
   :doc
   "Local macros and symbol macros\n\nLocal macros are defined by a macrolet form. They are usable only\ninside its body. Symbol macros can be defined globally\n(defsymbolmacro) or locally (symbol-macrolet). A symbol\nmacro defines a form that replaces a symbol during macro\nexpansion. Function arguments and symbols bound in let\nforms are not subject to symbol macro expansion.\n\nLocal macros are most useful in the definition of the expansion\nof another macro, they may be used anywhere. Global symbol\nmacros can be used only inside a with-symbol-macros form."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macros.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/macros-api.html",
   :name "clojure.contrib.macros",
   :author "Konrad Hinsen",
   :doc "Various small macros"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/map_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/map-utils-api.html",
   :name "clojure.contrib.map-utils",
   :author "Jason Wolfe, Chris Houser",
   :doc "Utilities for operating on Clojure maps."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/math-api.html",
   :name "clojure.contrib.math",
   :author "Mark Engelberg",
   :doc
   "Math functions that deal intelligently with the various\ntypes in Clojure's numeric tower, as well as math functions\ncommonly found in Scheme implementations.\n\nexpt - (expt x y) is x to the yth power, returns an exact number\n  if the base is an exact number, and the power is an integer,\n  otherwise returns a double.\nabs - (abs n) is the absolute value of n\ngcd - (gcd m n) returns the greatest common divisor of m and n\nlcm - (lcm m n) returns the least common multiple of m and n\n\nThe behavior of the next three functions on doubles is consistent\nwith the behavior of the corresponding functions\nin Java's Math library, but on exact numbers, returns an integer.\n\nfloor - (floor n) returns the greatest integer less than or equal to n.\n  If n is an exact number, floor returns an integer,\n  otherwise a double.\nceil - (ceil n) returns the least integer greater than or equal to n.\n  If n is an exact number, ceil returns an integer,\n  otherwise a double.\nround - (round n) rounds to the nearest integer.\n  round always returns an integer.  round rounds up for values\n  exactly in between two integers.\n\n\nsqrt - Implements the sqrt behavior I'm accustomed to from PLT Scheme,\n  specifically, if the input is an exact number, and is a square\n  of an exact number, the output will be exact.  The downside\n  is that for the common case (inexact square root), some extra\n  computation is done to look for an exact square root first.\n  So if you need blazingly fast square root performance, and you\n  know you're just going to need a double result, you're better\n  off calling java's Math/sqrt, or alternatively, you could just\n  convert your input to a double before calling this sqrt function.\n  If Clojure ever gets complex numbers, then this function will\n  need to be updated (so negative inputs yield complex outputs).\nexact-integer-sqrt - Implements a math function from the R6RS Scheme\n  standard.  (exact-integer-sqrt k) where k is a non-negative integer,\n  returns [s r] where k = s^2+r and k < (s+1)^2.  In other words, it\n  returns the floor of the square root and the "}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/miglayout-api.html",
   :name "clojure.contrib.miglayout",
   :author "Stephen C. Gilardi",
   :doc
   "Clojure support for the MiGLayout layout manager\nhttp://www.miglayout.com/\n\nExample:\n\n  (use '[clojure.contrib.miglayout.test :as mlt :only ()])\n  (dotimes [i 5] (mlt/run-test i))"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mmap.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/mmap-api.html",
   :name "clojure.contrib.mmap",
   :author "Chris Houser",
   :doc
   "Functions for memory-mapping files, plus some functions that use a\nmmaped file for \"normal\" activies -- slurp, load-file, etc."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/mock-api.html",
   :name "clojure.contrib.mock",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/monadic-io-streams-api.html",
   :name "clojure.contrib.monadic-io-streams",
   :author "Konrad Hinsen",
   :doc
   "Monadic I/O with Java input/output streams\nDefines monadic I/O statements to be used in a state monad\nwith an input or output stream as the state. The macro\nmonadic-io creates a stream, runs a monadic I/O statement\non it, and closes the stream. This structure permits the\ndefinition of purely functional compound I/O statements\nwhich are applied to streams that can never escape from the\nmonadic statement sequence."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/monads-api.html",
   :name "clojure.contrib.monads",
   :author "Konrad Hinsen",
   :doc
   "This library contains the most commonly used monads as well\nas macros for defining and using monads and useful monadic\nfunctions."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/ns-utils-api.html",
   :name "clojure.contrib.ns-utils",
   :author "Stephen C. Gilardi",
   :doc
   "Namespace utilities\n\nget-ns          returns the namespace named by a symbol or throws\n                if the namespace does not exist\n\nns-vars         returns a sorted seq of symbols naming public vars\n                in a namespace\n\nprint-docs      prints documentation for the public vars in a\n                namespace\n\nimmigrate       Create a public var in this namespace for each\n                public var in the namespaces named by ns-names.\n                From James Reeves\n\nvars            returns a sorted seq of symbols naming public vars\n                in a namespace (macro)\n\ndocs            prints documentation for the public vars in a\n                namespace (macro)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/4cce354d53502c1047990e96c0b424c41a4e0b67/src/main/clojure/clojure/contrib/pprint.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/pprint-api.html",
   :name "clojure.contrib.pprint",
   :author "Tom Faulhaber",
   :doc
   "This module comprises two elements:\n1) A pretty printer for Clojure data structures, implemented in the \n   function \"pprint\"\n2) A Common Lisp compatible format function, implemented as \n   \"cl-format\" because Clojure is using the name \"format\" \n   for its Java-based format function.\n\nSee documentation for those functions for more information or complete \ndocumentation on the the clojure-contrib web site on github."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.finite-distributions-api.html",
   :name "clojure.contrib.probabilities.finite-distributions",
   :author "Konrad Hinsen",
   :doc
   "Finite probability distributions\nThis library defines a monad for combining finite probability\ndistributions."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.monte-carlo-api.html",
   :name "clojure.contrib.probabilities.monte-carlo",
   :author "Konrad Hinsen",
   :doc
   "Monte-Carlo method support\n\nMonte-Carlo methods transform an input random number stream\n(usually having a continuous uniform distribution in the\ninterval [0, 1)) into a random number stream whose distribution\nsatisfies certain conditions (usually the expectation value\nis equal to some desired quantity). They are thus\ntransformations from one probability distribution to another one.\n\nThis library represents a Monte-Carlo method by a function that\ntakes as input the state of a random number stream with\nuniform distribution (see\nclojure.contrib.probabilities.random-numbers) and returns a\nvector containing one sample value of the desired output\ndistribution and the final state of the input random number\nstream. Such functions are state monad values and can be\ncomposed using operations defined in clojure.contrib.monads."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/probabilities.random-numbers-api.html",
   :name "clojure.contrib.probabilities.random-numbers",
   :author "Konrad Hinsen",
   :doc
   "Random number streams\n\nThis library provides random number generators with a common\nstream interface. They all produce pseudo-random numbers that are\nuniformly distributed in the interval [0, 1), i.e. 0 is a\npossible value but 1 isn't. For transformations to other\ndistributions, see clojure.contrib.probabilities.monte-carlo.\n\nAt the moment, the only generator provided is a rather simple\nlinear congruential generator."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/profile-api.html",
   :name "clojure.contrib.profile",
   :author "Stuart Sierra",
   :doc
   "Simple code profiling & timing measurement.\n\nWrap any section of code in the prof macro, giving it a name, like this:\n\n       (defn my-function [x y]\n         (let [sum (prof :addition (+ x y))\n               product (prof :multiplication (* x y))]\n           [sum product]))\n\nThe run your code in the profile macro, like this:\n\n       (profile (dotimes [i 10000] (my-function 3 4)))\n\nWhich prints a report for each named section of code:\n\n          Name      mean       min       max     count       sum\n      addition       265         0     37000     10000   2655000\nmultiplication       274         0     53000     10000   2747000\n\nTimes are measured in nanoseconds, to the maximum precision available\nunder the JVM.  See the function documentation for more details."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/properties-api.html",
   :name "clojure.contrib.properties",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/prxml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/prxml-api.html",
   :name "clojure.contrib.prxml",
   :author "Stuart Sierra",
   :doc
   "Compact syntax for generating XML. See the documentation of \"prxml\" \nfor details."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/91582e13e7b93b23fb53f821caa73fd23368d551/src/main/clojure/clojure/contrib/reflect.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/reflect-api.html",
   :name "clojure.contrib.reflect",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/repl-ln-api.html",
   :name "clojure.contrib.repl-ln",
   :author "Stephen C. Gilardi",
   :doc
   "A repl with that provides support for lines and line numbers in the\ninput stream."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/repl-utils-api.html",
   :name "clojure.contrib.repl-utils",
   :author
   "Chris Houser, Christophe Grand, Stephen Gilardi, Michel Salim",
   :doc "Utilities meant to be used interactively at the REPL"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/seq-api.html",
   :name "clojure.contrib.seq",
   :author "Stuart Sierra (and others)",
   :doc "Sequence utilities for Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/seq-utils-api.html",
   :name "clojure.contrib.seq-utils",
   :author "Stuart Sierra (and others)",
   :doc "Sequence utilities for Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/server_socket.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/server-socket-api.html",
   :name "clojure.contrib.server-socket",
   :author "Craig McDaniel",
   :doc "Server socket library - includes REPL on socket"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/f671a27b020bf746d02b9dbeeafdb4bd49ebf0b0/src/main/clojure/clojure/contrib/set.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/set-api.html",
   :name "clojure.contrib.set",
   :author "Jason Wolfe",
   :doc
   "Clojure functions for operating on sets (supplemental to clojure.set)"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6e721ff777dd52801cafe693868d8118a62076de/src/main/clojure/clojure/contrib/shell.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/shell-api.html",
   :name "clojure.contrib.shell",
   :author "Chris Houser",
   :doc
   "Conveniently launch a sub-process providing to its stdin and\ncollecting its stdout"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6e721ff777dd52801cafe693868d8118a62076de/src/main/clojure/clojure/contrib/shell_out.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/shell-out-api.html",
   :name "clojure.contrib.shell-out",
   :author "Chris Houser",
   :doc
   "Conveniently launch a sub-process providing to its stdin and\ncollecting its stdout"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/singleton.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/singleton-api.html",
   :name "clojure.contrib.singleton",
   :author "Stuart Sierra",
   :doc "Singleton functions"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj",
   :wiki-url "http://clojure.github.com/clojure-contrib/sql-api.html",
   :name "clojure.contrib.sql",
   :author "Stephen C. Gilardi",
   :doc "A Clojure interface to sql databases via jdbc."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/str-utils-api.html",
   :name "clojure.contrib.str-utils",
   :author "Stuart Sierra",
   :doc "String utilities for Clojure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/str-utils2-api.html",
   :name "clojure.contrib.str-utils2",
   :author "Stuart Sierra",
   :doc
   "This is a library of string manipulation functions.  It\nis intented as a replacement for clojure.contrib.str-utils.\n\nYou cannot (use 'clojure.contrib.str-utils2) because it defines\nfunctions with the same names as functions in clojure.core.\nInstead, do (require '[clojure.contrib.str-utils2 :as s]) \nor something similar.\n\nGoals:\n  1. Be functional\n  2. String argument first, to work with ->\n  3. Performance linear in string length\n\nSome ideas are borrowed from\nhttp://github.com/francoisdevlin/devlinsf-clojure-utils/"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/stream-utils-api.html",
   :name "clojure.contrib.stream-utils",
   :author "Konrad Hinsen",
   :doc
   "Functions for setting up computational pipelines via data streams.\n\nNOTE: This library is experimental. It may change significantly\n      with future release.\n\nThis library defines:\n- an abstract stream type, whose interface consists of the\n  multimethod stream-next\n- a macro for implementing streams\n- implementations of stream for\n  1) Clojure sequences, and vectors\n  2) nil, representing an empty stream\n- tools for writing stream transformers, including the\n  monad stream-m\n- various utility functions for working with streams\n\nStreams are building blocks in the construction of computational\npipelines. A stream is represented by its current state plus\na function that takes a stream state and obtains the next item\nin the stream as well as the new stream state. The state is\nimplemented as a Java class or a Clojure type (as defined by the\nfunction clojure.core/type), and the function is provided as an\nimplementation of the multimethod stream-next for this class or type.\n\nWhile setting up pipelines using this mechanism is somewhat more\ncumbersome than using Clojure's lazy seq mechanisms, there are a\nfew advantages:\n- The state of a stream can be stored in any Clojure data structure,\n  and the stream can be re-generated from it any number of times.\n  Any number of states can be stored this way.\n- The elements of the stream are never cached, so keeping a reference\n  to a stream state does not incur an uncontrollable memory penalty.\n\nNote that the stream mechanism is thread-safe as long as the\nconcrete stream implementations do not use any mutable state.\n\nStream transformers take any number of input streams and produce one\noutput stream. They are typically written using the stream-m\nmonad. In the definition of a stream transformer, (pick s) returns\nthe next value of stream argument s, whereas pick-all returns the\nnext value of all stream arguments in the form of a vector."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/string-api.html",
   :name "clojure.contrib.string",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/62078f31f425a0bf4be6508a51ac1fa8ce09ea51/src/main/clojure/clojure/contrib/strint.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/strint-api.html",
   :name "clojure.contrib.strint",
   :author "Chas Emerick",
   :doc "String interpolation for Clojure."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/swing-utils-api.html",
   :name "clojure.contrib.swing-utils",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/test-is-api.html",
   :name "clojure.contrib.test-is",
   :author "Stuart Sierra",
   :doc
   "Backwards-compatibility for clojure.contrib.test-is\n\nThe clojure.contrib.test-is library moved from Contrib into the\nClojure distribution as clojure.test.\n\nThis happened on or around clojure-contrib Git commit\n82cf0409d0fcb71be477ebfc4da18ee2128a2ad1 on June 25, 2009.\n\nThis file makes the clojure.test interface available under the old\nnamespace clojure.contrib.test-is.\n\nThis includes support for the old syntax of the 'are' macro.\n\nThis was suggested by Howard Lewis Ship in ticket #26, \nhttp://www.assembla.com/spaces/clojure-contrib/tickets/26"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/trace-api.html",
   :name "clojure.contrib.trace",
   :author "Stuart Sierra, Michel Salim",
   :doc
   "This file defines simple \"tracing\" macros to help you see what your\ncode is doing."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/types.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/types-api.html",
   :name "clojure.contrib.types",
   :author "Konrad Hinsen",
   :doc "General and algebraic data types"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/with_ns.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/with-ns-api.html",
   :name "clojure.contrib.with-ns",
   :author "Stuart Sierra",
   :doc "Temporary namespace macro"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/zip-filter-api.html",
   :name "clojure.contrib.zip-filter",
   :author "Chris Houser",
   :doc
   "System for filtering trees and nodes generated by zip.clj in\ngeneral, and xml trees in particular."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/condition.Condition-api.html",
   :name "clojure.contrib.condition.Condition",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.database-api.html",
   :name "clojure.contrib.datalog.database",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.literals-api.html",
   :name "clojure.contrib.datalog.literals",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.magic-api.html",
   :name "clojure.contrib.datalog.magic",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.rules-api.html",
   :name "clojure.contrib.datalog.rules",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/softstrat.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.softstrat-api.html",
   :name "clojure.contrib.datalog.softstrat",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/datalog.util-api.html",
   :name "clojure.contrib.datalog.util",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/miglayout.internal-api.html",
   :name "clojure.contrib.miglayout.internal",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/mock/test_adapter.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/mock.test-adapter-api.html",
   :name "clojure.contrib.mock.test-adapter",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/sql.internal-api.html",
   :name "clojure.contrib.sql.internal",
   :doc nil}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure-contrib/zip-filter.xml-api.html",
   :name "clojure.contrib.zip-filter.xml",
   :doc nil}),
 :vars
 ({:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L31",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/add",
   :namespace "clojure.contrib.accumulators",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "multimethod",
   :arglists ([acc item]),
   :doc
   "Add item to the accumulator acc. The exact meaning of adding an\nan item depends on the type of the accumulator.",
   :name "add"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L37",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/add-items",
   :namespace "clojure.contrib.accumulators",
   :line 37,
   :file "clojure/contrib/accumulators.clj",
   :var-type "function",
   :arglists ([acc items]),
   :doc
   "Add all elements of a collection coll to the accumulator acc.",
   :name "add-items"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/combine",
   :namespace "clojure.contrib.accumulators",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/accumulators.clj",
   :var-type "multimethod",
   :arglists ([& accs]),
   :doc
   "Combine the values of the accumulators acc1 and acc2 into a\nsingle accumulator of the same type.",
   :name "combine"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L271",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-counter",
   :namespace "clojure.contrib.accumulators",
   :line 271,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty counter accumulator. Its value is a map that stores for\nevery item the number of times it was added.",
   :name "empty-counter"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L292",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-counter-with-total",
   :namespace "clojure.contrib.accumulators",
   :line 292,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty counter-with-total accumulator. It works like the counter\naccumulator, except that the total number of items added is stored as the\nvalue of the key :total.",
   :name "empty-counter-with-total"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-list",
   :namespace "clojure.contrib.accumulators",
   :line 88,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty list accumulator. Adding an item appends it at the beginning.",
   :name "empty-list"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L145",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-map",
   :namespace "clojure.contrib.accumulators",
   :line 145,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty map accumulator. Items to be added must be [key value] pairs.",
   :name "empty-map"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L185",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-maximum",
   :namespace "clojure.contrib.accumulators",
   :line 185,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty maximum accumulator. Only numbers can be added.",
   :name "empty-maximum"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L232",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-mean-variance",
   :namespace "clojure.contrib.accumulators",
   :line 232,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty mean-variance accumulator, combining sample mean and\nsample variance. Only numbers can be added.",
   :name "empty-mean-variance"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L207",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-min-max",
   :namespace "clojure.contrib.accumulators",
   :line 207,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty min-max accumulator, combining minimum and maximum.\nOnly numbers can be added.",
   :name "empty-min-max"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L191",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-minimum",
   :namespace "clojure.contrib.accumulators",
   :line 191,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty minimum accumulator. Only numbers can be added.",
   :name "empty-minimum"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L177",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-product",
   :namespace "clojure.contrib.accumulators",
   :line 177,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty sum accumulator. Only numbers can be added.",
   :name "empty-product"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L102",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-queue",
   :namespace "clojure.contrib.accumulators",
   :line 102,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty queue accumulator. Adding an item appends it at the end.",
   :name "empty-queue"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-set",
   :namespace "clojure.contrib.accumulators",
   :line 116,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty set accumulator.",
   :name "empty-set"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L130",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-string",
   :namespace "clojure.contrib.accumulators",
   :line 130,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty string accumulator. Adding an item (string or character)\nappends it at the end.",
   :name "empty-string"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L174",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-sum",
   :namespace "clojure.contrib.accumulators",
   :line 174,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc "An empty sum accumulator. Only numbers can be added.",
   :name "empty-sum"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L310",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-tuple",
   :namespace "clojure.contrib.accumulators",
   :line 310,
   :file "clojure/contrib/accumulators.clj",
   :var-type "function",
   :arglists ([empty-accumulators]),
   :doc
   "Returns an accumulator tuple with the supplied empty-accumulators\nas its value. Accumulator tuples consist of several accumulators that\nwork in parallel. Added items must be sequences whose number of elements\nmatches the number of sub-accumulators.",
   :name "empty-tuple"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/accumulators.clj#L74",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//accumulators-api.html#clojure.contrib.accumulators/empty-vector",
   :namespace "clojure.contrib.accumulators",
   :line 74,
   :file "clojure/contrib/accumulators.clj",
   :var-type "var",
   :doc
   "An empty vector accumulator. Adding an item appends it at the end.",
   :name "empty-vector"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/agent_utils.clj#L22",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//agent-utils-api.html#clojure.contrib.agent-utils/capture-and-send",
   :namespace "clojure.contrib.agent-utils",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/agent_utils.clj",
   :var-type "macro",
   :arglists ([vars agent action & args]),
   :doc
   "Capture the current value of the specified vars and rebind \nthem on the agent thread before executing the action.\n\nExample:\n  (capture-and-send [*out*] a f b c)",
   :name "capture-and-send"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/73accf597eafb8dfcb642702a3b98b057bbdbbdf/src/main/clojure/clojure/contrib/apply_macro.clj#L34",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//apply-macro-api.html#clojure.contrib.apply-macro/apply-macro",
   :namespace "clojure.contrib.apply-macro",
   :line 34,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/apply_macro.clj",
   :var-type "macro",
   :arglists ([macro & args]),
   :doc
   "This is evil.  Don't ever use it.  It makes a macro behave like a\nfunction.  Seriously, how messed up is that?\n\nEvaluates all args, then uses them as arguments to the macro as with\napply.\n\n(def things [true true false])\n(apply-macro and things)\n;; Expands to:  (and true true false)",
   :name "apply-macro"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/base64.clj#L27",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/encode",
   :namespace "clojure.contrib.base64",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/base64.clj",
   :var-type "function",
   :arglists ([input output alphabet line-length]),
   :doc
   "Encodes bytes of input, writing Base 64 text on output.  alphabet\nis a 65-character String containing the 64 characters to use in the\nencoding; the 65th character is the pad character.  line-length is\nthe maximum number of characters per line, nil for no line breaks.",
   :name "encode"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/base64.clj#L79",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//base64-api.html#clojure.contrib.base64/encode-str",
   :namespace "clojure.contrib.base64",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/base64.clj",
   :var-type "function",
   :arglists ([s] [s encoding line-length]),
   :doc
   "Encodes String in base 64; returns a String.  If not specified,\nencoding is UTF-8 and line-length is nil.",
   :name "encode-str"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/classpath.clj#L23",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath",
   :namespace "clojure.contrib.classpath",
   :line 23,
   :file "clojure/contrib/classpath.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File objects of the elements on CLASSPATH.",
   :name "classpath"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/classpath.clj#L30",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath-directories",
   :namespace "clojure.contrib.classpath",
   :line 30,
   :file "clojure/contrib/classpath.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of File objects for the directories on classpath.",
   :name "classpath-directories"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/classpath.clj#L35",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//classpath-api.html#clojure.contrib.classpath/classpath-jarfiles",
   :namespace "clojure.contrib.classpath",
   :line 35,
   :file "clojure/contrib/classpath.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a sequence of JarFile objects for the JAR files on classpath.",
   :name "classpath-jarfiles"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L107",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/cartesian-product",
   :namespace "clojure.contrib.combinatorics",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([& seqs]),
   :doc "All the ways to take one item from each sequence",
   :name "cartesian-product"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/combinations",
   :namespace "clojure.contrib.combinatorics",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([items n]),
   :doc
   "All the unique ways of taking n different elements from items",
   :name "combinations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L151",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/lex-permutations",
   :namespace "clojure.contrib.combinatorics",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([c]),
   :doc
   "Fast lexicographic permutation generator for a sequence of numbers",
   :name "lex-permutations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L160",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/permutations",
   :namespace "clojure.contrib.combinatorics",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([items]),
   :doc "All the permutations of items, lexicographic by index",
   :name "permutations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L127",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/selections",
   :namespace "clojure.contrib.combinatorics",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([items n]),
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :name "selections"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/combinatorics.clj#L101",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//combinatorics-api.html#clojure.contrib.combinatorics/subsets",
   :namespace "clojure.contrib.combinatorics",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/combinatorics.clj",
   :var-type "function",
   :arglists ([items]),
   :doc "All the subsets of items",
   :name "subsets"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/command_line.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//command-line-api.html#clojure.contrib.command-line/with-command-line",
   :namespace "clojure.contrib.command-line",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/command_line.clj",
   :var-type "macro",
   :arglists ([args desc cmdspec & body]),
   :doc "Bind locals to command-line args.",
   :name "with-command-line"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/cond.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//cond-api.html#clojure.contrib.cond/cond-let",
   :namespace "clojure.contrib.cond",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/cond.clj",
   :var-type "macro",
   :arglists ([bindings & clauses]),
   :doc
   "Takes a binding-form and a set of test/expr pairs. Evaluates each test\none at a time. If a test returns logical true, cond-let evaluates and\nreturns expr with binding-form bound to the value of test and doesn't\nevaluate any of the other tests or exprs. To provide a default value\neither provide a literal that evaluates to logical true and is\nbinding-compatible with binding-form, or use :else as the test and don't\nrefer to any parts of binding-form in the expr. (cond-let binding-form)\nreturns nil.",
   :name "cond-let"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/*full-stack-traces*",
   :namespace "clojure.contrib.condition",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition.clj",
   :var-type "var",
   :doc
   "Bind to true to include clojure.{core,lang,main} frames in stack\ntraces",
   :name "*full-stack-traces*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/handler-case",
   :namespace "clojure.contrib.condition",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition.clj",
   :var-type "macro",
   :arglists ([dispatch-fn & body]),
   :doc
   "Executes body in a context where raised conditions can be handled.\n\ndispatch-fn accepts a raised condition (a map) and returns a selector\nused to choose a handler. Commonly, dispatch-fn will be :type to dispatch\non the condition's :type value.\n\nHandlers are forms within body:\n\n  (handle key\n    ...)\n\nIf a condition is raised, executes the body of the first handler whose\nkey satisfies (isa? selector key). If no handlers match, re-raises the\ncondition.\n\nWhile a handler is running, *condition* is bound to the condition being\nhandled and *selector* is bound to to the value returned by dispatch-fn\nthat matched the handler's key.",
   :name "handler-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj#L128",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/print-stack-trace",
   :namespace "clojure.contrib.condition",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Prints a stack trace for a condition or Throwable. Skips frames for\nclasses in clojure.{core,lang,main} unless the *full-stack-traces* is\nbound to logical true",
   :name "print-stack-trace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj#L60",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/raise",
   :namespace "clojure.contrib.condition",
   :line 60,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition.clj",
   :var-type "macro",
   :arglists ([] [m] [key val & keyvals]),
   :doc
   "Raises a condition. With no arguments, re-raises the current condition.\nWith one argument (a map), raises the argument. With two or more\narguments, raises a map with keys and values from the arguments.",
   :name "raise"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/condition.clj#L106",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition/stack-trace-info",
   :namespace "clojure.contrib.condition",
   :line 106,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition.clj",
   :var-type "multimethod",
   :doc
   "Returns header, stack-trace, and cause info from conditions and\nThrowables",
   :name "stack-trace-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L30",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/-?>",
   :namespace "clojure.contrib.core",
   :line 30,
   :file "clojure/contrib/core.clj",
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "Same as clojure.core/-> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?> \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(-?> nil .toUpperCase (.substring 1)) returns nil\n",
   :name "-?>"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/-?>>",
   :namespace "clojure.contrib.core",
   :line 46,
   :file "clojure/contrib/core.clj",
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "Same as clojure.core/->> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?>> (range 5) (map inc)) returns (1 2 3 4 5)\n(-?>> [] seq (map inc)) returns nil\n",
   :name "-?>>"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/.?.",
   :namespace "clojure.contrib.core",
   :line 38,
   :file "clojure/contrib/core.clj",
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "Same as clojure.core/.. but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(.?. \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(.?. nil .toUpperCase (.substring 1)) returns nil\n",
   :name ".?."}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/dissoc-in",
   :namespace "clojure.contrib.core",
   :line 57,
   :file "clojure/contrib/core.clj",
   :var-type "function",
   :arglists ([m [k & ks :as keys]]),
   :doc
   "Dissociates an entry from a nested associative structure returning a new\nnested structure. keys is a sequence of keys. Any empty maps that result\nwill not be present in the new structure.",
   :name "dissoc-in"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/new-by-name",
   :namespace "clojure.contrib.core",
   :line 71,
   :file "clojure/contrib/core.clj",
   :var-type "function",
   :arglists ([class-name & args]),
   :doc
   "Constructs a Java object whose class is specified by a String.",
   :name "new-by-name"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/core.clj#L78",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//core-api.html#clojure.contrib.core/seqable?",
   :namespace "clojure.contrib.core",
   :line 78,
   :file "clojure/contrib/core.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns true if (seq x) will succeed, false otherwise.",
   :name "seqable?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L461",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/add-cell-watcher",
   :namespace "clojure.contrib.dataflow",
   :line 461,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([cell key fun]),
   :doc
   "Adds a watcher to a cell to respond to changes of value.  The is a\nfunction of 4 values: a key, the cell, its old value, its new\nvalue.  This is implemented using Clojure's add-watch to the\nunderlying ref, and shared its sematics",
   :name "add-cell-watcher"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L211",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/add-cells",
   :namespace "clojure.contrib.dataflow",
   :line 211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df cells]),
   :doc "Given a collection of cells, add them to the dataflow.",
   :name "add-cells"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L189",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-dataflow",
   :namespace "clojure.contrib.dataflow",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([cs]),
   :doc
   "Given a collection of cells, build and return a dataflow object",
   :name "build-dataflow"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L232",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-source-cell",
   :namespace "clojure.contrib.dataflow",
   :line 232,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([name init]),
   :doc "Builds a source cell",
   :name "build-source-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L293",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-standard-cell",
   :namespace "clojure.contrib.dataflow",
   :line 293,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([name deps fun expr]),
   :doc "Builds a standard cell",
   :name "build-standard-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L299",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/build-validator-cell",
   :namespace "clojure.contrib.dataflow",
   :line 299,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([deps fun expr]),
   :doc "Builds a validator cell",
   :name "build-validator-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L305",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/cell",
   :namespace "clojure.contrib.dataflow",
   :line 305,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "macro",
   :arglists ([type & data]),
   :doc
   "Build a standard cell, like this:\n\n (cell fred\n    (* ?mary ?joe))\n\nWhich creates a cell named fred that is the product of a cell mary and cell joe\n\nOr:\n\n (cell joe\n   (apply * ?*sally))\n\nWhich creates a cell that applies * to the collection of all cells named sally\n\nOr:\n\n (cell :source fred 0)\n\nWhich builds a source cell fred with initial value 0\n\nOr:\n\n  (cell :validator (when (< ?fred ?sally)\n                       (throwf \"%s must be greater than %s\" ?fred ?sally))\n\nWhich will perform the validation",
   :name "cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L349",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/display-cell",
   :namespace "clojure.contrib.dataflow",
   :line 349,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "multimethod",
   :doc "A 'readable' form of the cell",
   :name "display-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L373",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/eval-cell",
   :namespace "clojure.contrib.dataflow",
   :line 373,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "multimethod",
   :doc "Evaluate a dataflow cell.  Return [changed, old val]",
   :name "eval-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L95",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-cell",
   :namespace "clojure.contrib.dataflow",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df name]),
   :doc "Get the single cell named by name",
   :name "get-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-cells",
   :namespace "clojure.contrib.dataflow",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df name]),
   :doc "Get all the cells named by name",
   :name "get-cells"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L137",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-old-value",
   :namespace "clojure.contrib.dataflow",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df env name]),
   :doc "Looks up an old value",
   :name "get-old-value"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L109",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-source-cells",
   :namespace "clojure.contrib.dataflow",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df]),
   :doc "Returns a collection of source cells from the dataflow",
   :name "get-source-cells"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-value",
   :namespace "clojure.contrib.dataflow",
   :line 116,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df name]),
   :doc
   "Gets a value from the df matching the passed symbol.\nSignals an error if the name is not present, or if it not a single\nvalue.",
   :name "get-value"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L144",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-value-from-cell",
   :namespace "clojure.contrib.dataflow",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([cell]),
   :doc "Given a cell, get its value",
   :name "get-value-from-cell"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L127",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/get-values",
   :namespace "clojure.contrib.dataflow",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df name]),
   :doc "Gets a collection of values from the df by name",
   :name "get-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L200",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/print-dataflow",
   :namespace "clojure.contrib.dataflow",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df]),
   :doc "Prints a dataflow, one cell per line",
   :name "print-dataflow"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L219",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/remove-cells",
   :namespace "clojure.contrib.dataflow",
   :line 219,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df cells]),
   :doc "Given a collection of cells, remove them from the dataflow.",
   :name "remove-cells"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L104",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/source-cell?",
   :namespace "clojure.contrib.dataflow",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([cell]),
   :doc "Is this cell a source cell?",
   :name "source-cell?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/dataflow.clj#L439",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//dataflow-api.html#clojure.contrib.dataflow/update-values",
   :namespace "clojure.contrib.dataflow",
   :line 439,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/dataflow.clj",
   :var-type "function",
   :arglists ([df data]),
   :doc
   "Given a dataflow, and a map of name-value pairs, update the\ndataflow by binding the new values.  Each name must be of a source\ncell",
   :name "update-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog/build-work-plan",
   :namespace "clojure.contrib.datalog",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog.clj",
   :var-type "function",
   :arglists ([rules query]),
   :doc
   "Given a list of rules and a query, build a work plan that can be\nused to execute the query.",
   :name "build-work-plan"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog/run-work-plan",
   :namespace "clojure.contrib.datalog",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog.clj",
   :var-type "function",
   :arglists ([work-plan database query-bindings]),
   :doc
   "Given a work plan, a database, and some query bindings, run the\nwork plan and return the results.",
   :name "run-work-plan"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defalias",
   :namespace "clojure.contrib.def",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name orig] [name orig doc]),
   :doc
   "Defines an alias for a var: a new var with the same root binding (if\nany) and similar metadata. The metadata of the alias is its initial\nmetadata (as provided by def) merged into the metadata of the original.",
   :name "defalias"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L85",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defhinted",
   :namespace "clojure.contrib.def",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([sym init]),
   :doc
   "Defines a var with a type hint matching the class of the given\ninit.  Be careful about using any form of 'def' or 'binding' to a\nvalue of a different type.  See http://paste.lisp.org/display/73344",
   :name "defhinted"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L39",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defmacro-",
   :namespace "clojure.contrib.def",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defmacro but yields a private definition",
   :name "defmacro-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L143",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defn-memo",
   :namespace "clojure.contrib.def",
   :line 143,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([fn-name & defn-stuff]),
   :doc
   "Just like defn, but memoizes the function using clojure.core/memoize",
   :name "defn-memo"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L122",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defnk",
   :namespace "clojure.contrib.def",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([fn-name & fn-tail]),
   :doc
   "Define a function accepting keyword arguments. Symbols up to the first\nkeyword in the parameter list are taken as positional arguments.  Then\nan alternating sequence of keywords and defaults values is expected. The\nvalues of the keyword arguments are available in the function body by\nvirtue of the symbol corresponding to the keyword (cf. :keys destructuring).\ndefnk accepts an optional docstring as well as an optional metadata map.",
   :name "defnk"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defonce-",
   :namespace "clojure.contrib.def",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name expr] [name expr doc]),
   :doc "Same as defonce but yields a private definition",
   :name "defonce-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defstruct-",
   :namespace "clojure.contrib.def",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defstruct but yields a private definition",
   :name "defstruct-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L32",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defunbound",
   :namespace "clojure.contrib.def",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name] [name doc]),
   :doc "Defines an unbound var with optional doc string",
   :name "defunbound"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defunbound-",
   :namespace "clojure.contrib.def",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defunbound but yields a private definition",
   :name "defunbound-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L23",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defvar",
   :namespace "clojure.contrib.def",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name] [name init] [name init doc]),
   :doc "Defines a var with an optional intializer and doc string",
   :name "defvar"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L44",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/defvar-",
   :namespace "clojure.contrib.def",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defvar but yields a private definition",
   :name "defvar-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/def.clj#L96",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//def-api.html#clojure.contrib.def/name-with-attributes",
   :namespace "clojure.contrib.def",
   :line 96,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/def.clj",
   :var-type "function",
   :arglists ([name macro-args]),
   :doc
   "To be used in macro definitions.\nHandles optional docstrings and attribute maps for a name to be defined\nin a list of macro arguments. If the first macro argument is a string,\nit is added as a docstring to name and removed from the macro argument\nlist. If afterwards the first macro argument is a map, its entries are\nadded to the name's metadata map and the map is removed from the\nmacro argument list. The return value is a vector containing the name\nwith its extended metadata map and the list of unprocessed macro\narguments.",
   :name "name-with-attributes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L146",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/*append-to-writer*",
   :namespace "clojure.contrib.duck-streams",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "var",
   :doc
   "If true, writer and spit will open files in append mode.\nDefaults to false.  Use append-writer or append-spit.",
   :name "*append-to-writer*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L78",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/*buffer-size*",
   :namespace "clojure.contrib.duck-streams",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "var",
   :doc
   "Size, in bytes or characters, of the buffer used when\ncopying streams.",
   :name "*buffer-size*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L83",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/*byte-array-type*",
   :namespace "clojure.contrib.duck-streams",
   :line 83,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "var",
   :doc "Type object for a Java primitive byte array.",
   :name "*byte-array-type*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L72",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/*default-encoding*",
   :namespace "clojure.contrib.duck-streams",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "var",
   :doc
   "Name of the default encoding to use when reading & writing.\nDefault is UTF-8.",
   :name "*default-encoding*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L265",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/append-spit",
   :namespace "clojure.contrib.duck-streams",
   :line 265,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([f content]),
   :doc "Like spit but appends to file.",
   :name "append-spit"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L217",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/append-writer",
   :namespace "clojure.contrib.duck-streams",
   :line 217,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Like writer but opens file for appending.  Does not work on streams\nthat are already open.",
   :name "append-writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L301",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/copy",
   :namespace "clojure.contrib.duck-streams",
   :line 301,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "multimethod",
   :arglists ([input output]),
   :doc
   "Copies input to output.  Returns nil.\nInput may be an InputStream, Reader, File, byte[], or String.\nOutput may be an OutputStream, Writer, or File.\n\nDoes not close any streams except those it opens itself \n(on a File).\n\nWriting a File fails if the parent directory does not exist.",
   :name "copy"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/file-str",
   :namespace "clojure.contrib.duck-streams",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Concatenates args as strings and returns a java.io.File.  Replaces\nall / and \\ with File/separatorChar.  Replaces ~ at the start of\nthe path with the user.home system property.",
   :name "file-str"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L388",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/make-parents",
   :namespace "clojure.contrib.duck-streams",
   :line 388,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([file]),
   :doc "Creates all parent directories of file.",
   :name "make-parents"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L271",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/pwd",
   :namespace "clojure.contrib.duck-streams",
   :line 271,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns current working directory as a String.  (Like UNIX 'pwd'.)\nNote: In Java, you cannot change the current working directory.",
   :name "pwd"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L236",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/read-lines",
   :namespace "clojure.contrib.duck-streams",
   :line 236,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "Like clojure.core/line-seq but opens f with reader.  Automatically\ncloses the reader AFTER YOU CONSUME THE ENTIRE SEQUENCE.",
   :name "read-lines"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L102",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/reader",
   :namespace "clojure.contrib.duck-streams",
   :line 102,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open\njava.io.BufferedReader.  Argument may be an instance of Reader,\nBufferedReader, InputStream, File, URI, URL, Socket, or String.\n\nIf argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.  Uses *default-encoding* as the text encoding.\n\nShould be used inside with-open to ensure the Reader is properly\nclosed.",
   :name "reader"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L247",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/slurp*",
   :namespace "clojure.contrib.duck-streams",
   :line 247,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "Like clojure.core/slurp but opens f with reader.",
   :name "slurp*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L258",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/spit",
   :namespace "clojure.contrib.duck-streams",
   :line 258,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([f content]),
   :doc
   "Opposite of slurp.  Opens f with writer, writes content, then\ncloses f.",
   :name "spit"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L393",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/to-byte-array",
   :namespace "clojure.contrib.duck-streams",
   :line 393,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "multimethod",
   :arglists ([arg]),
   :doc
   "Converts argument into a Java byte array.  Argument may be\na String, File, InputStream, or Reader.  If the argument is already\na byte array, returns it.",
   :name "to-byte-array"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L294",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/with-in-reader",
   :namespace "clojure.contrib.duck-streams",
   :line 294,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "macro",
   :arglists ([f & body]),
   :doc
   "Opens a PushbackReader on f, binds it to *in*, and evaluates body.",
   :name "with-in-reader"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L287",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/with-out-append-writer",
   :namespace "clojure.contrib.duck-streams",
   :line 287,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "macro",
   :arglists ([f & body]),
   :doc "Like with-out-writer but appends to file.",
   :name "with-out-append-writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L279",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/with-out-writer",
   :namespace "clojure.contrib.duck-streams",
   :line 279,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "macro",
   :arglists ([f & body]),
   :doc
   "Opens a writer on f, binds it to *out*, and evalutes body.\nAnything printed within body will be written to f.",
   :name "with-out-writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L225",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/write-lines",
   :namespace "clojure.contrib.duck-streams",
   :line 225,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "function",
   :arglists ([f lines]),
   :doc
   "Writes lines (a seq) to f, separated by newlines.  f is opened with\nwriter, and automatically closed at the end of the sequence.",
   :name "write-lines"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/aa3f018f65006c78b08703e7adef04b7f39e1542/src/main/clojure/clojure/contrib/duck_streams.clj#L153",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//duck-streams-api.html#clojure.contrib.duck-streams/writer",
   :namespace "clojure.contrib.duck-streams",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/duck_streams.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open java.io.PrintWriter\nwrapped around a java.io.BufferedWriter.  Argument may be an\ninstance of Writer, PrintWriter, BufferedWriter, OutputStream, File,\nURI, URL, Socket, or String.\n\nIf argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the Writer is properly\nclosed.",
   :name "writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L150",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/bind-continue",
   :namespace "clojure.contrib.error-kit",
   :line 150,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "function",
   :arglists ([continue-name [args*] & body]),
   :doc
   "Special form to be used inside a 'with-handler'.\nControl can be passed to this 'continue' form from a 'raise' enclosed\nin this with-handler's dynamic scope, when this 'continue-name' is\ngiven to a 'continue' form.",
   :name "bind-continue"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/deferror",
   :namespace "clojure.contrib.error-kit",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "macro",
   :arglists
   ([name [parent-error?] doc-string? [args*] & body]
    [name [parent-error?] doc-string? args-destruct-map & body]),
   :doc "Define a new error type",
   :name "deferror"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L117",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/do-not-handle",
   :namespace "clojure.contrib.error-kit",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "macro",
   :arglists ([]),
   :doc
   "Use in a tail position of a 'handle' form to indicate 'raise' should\nnot consider the error handled, but should continue searching for an\nappropriate 'handle' form.  Allows finer-grain control over catching\nthan just the error type.",
   :name "do-not-handle"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/error",
   :namespace "clojure.contrib.error-kit",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "function",
   :arglists ([details]),
   :doc "Base type for all error-kit errors",
   :name "error"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L138",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/handle",
   :namespace "clojure.contrib.error-kit",
   :line 138,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "function",
   :arglists
   ([error-name? [args*] & body]
    [error-name? args-destruct-map-args & body]),
   :doc
   "Special form to be used inside a 'with-handler'.  When\nany error is 'raised' from withing the dynamic scope of 'body' that\nis of error-name's type or a derived type, the args will be bound\nand the body executed.  If no 'error-name' is given, the body will\nbe executed for regardless of the type of error raised.  The body\nmay return a value, in which case that will be the return value of\nthe entire 'with-handler' form, or it may use any of the special\nreturn forms, 'do-not-handle', 'continue-with', or 'continue'.",
   :name "handle"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L110",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/raise",
   :namespace "clojure.contrib.error-kit",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "macro",
   :arglists ([err-name & args]),
   :doc
   "Raise an error of the type err-name, constructed with the given args",
   :name "raise"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L86",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/raise*",
   :namespace "clojure.contrib.error-kit",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "function",
   :arglists ([err]),
   :doc
   "Raise the given error object, best if created by an error\nconstructor defined with deferror.  See also 'raise' macro.",
   :name "raise*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L39",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/throw-msg",
   :namespace "clojure.contrib.error-kit",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "macro",
   :arglists ([class-name]),
   :doc
   "Returns a function that throws a Java Exception with the given\nname.  Useful to associate a new error-kit error type with a\nparticular Java Exception class, via the :unhandled error key.",
   :name "throw-msg"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/error_kit.clj#L163",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//error-kit-api.html#clojure.contrib.error-kit/with-handler",
   :namespace "clojure.contrib.error-kit",
   :line 163,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/error_kit.clj",
   :var-type "macro",
   :arglists ([& forms]),
   :doc
   "This is error-kit's dynamic scope form.  The body will be executed\nin a dynamic context that includes all of the following 'handle' and\n'bind-continue' forms.",
   :name "with-handler"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/except.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-arg",
   :namespace "clojure.contrib.except",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/except.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Throws an IllegalArgumentException. All arguments are optional:\n\n      cause? format? format-args*\n\n- cause defaults to nil, if present it must be a Throwable\n- format is a format string for clojure.core/format\n- format-args are objects that correspond to format specifiers in\n  format.",
   :name "throw-arg"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/except.clj#L43",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-if",
   :namespace "clojure.contrib.except",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/except.clj",
   :var-type "function",
   :arglists ([test & args]),
   :doc
   "Throws an Exception or Error if test is true. args are those documented\nfor throwf.",
   :name "throw-if"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/except.clj#L50",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throw-if-not",
   :namespace "clojure.contrib.except",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/except.clj",
   :var-type "function",
   :arglists ([test & args]),
   :doc
   "Throws an Exception or Error if test is false. args are those documented\nfor throwf.",
   :name "throw-if-not"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/except.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//except-api.html#clojure.contrib.except/throwf",
   :namespace "clojure.contrib.except",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/except.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Throws an Exception or Error with an optional message formatted using\nclojure.core/format. All arguments are optional:\n\n    class? cause? format? format-args*\n\n- class defaults to Exception, if present it must name a kind of\n  Throwable\n- cause defaults to nil, if present it must be a Throwable\n- format is a format string for clojure.core/format\n- format-args are objects that correspond to format specifiers in\n  format.",
   :name "throwf"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj#L79",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/case",
   :namespace "clojure.contrib.fcase",
   :line 79,
   :file "clojure/contrib/fcase.clj",
   :var-type "macro",
   :arglists ([test-value & clauses]),
   :doc
   "Like cond, but test-value is compared against the value of each\ntest expression with =.  If they are equal, executes the \"body\"\nexpression.  Optional last expression is executed if none of the\ntest expressions match.",
   :name "case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj#L40",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/fcase",
   :namespace "clojure.contrib.fcase",
   :line 40,
   :file "clojure/contrib/fcase.clj",
   :var-type "macro",
   :arglists ([compare-fn case-value & test-expr-clauses]),
   :doc
   "Generic switch/case macro.  'fcase' is short for 'function case'.\n\nThe 'compare-fn' is a fn of two arguments.\n\nThe 'test-expr-clauses' are value-expression pairs without\nsurrounding parentheses, like in Clojure's 'cond'.\n\nThe 'case-value' is evaluated once and cached.  Then, 'compare-fn'\nis called once for each clause, with the clause's test value as its\nfirst argument and 'case-value' as its second argument.  If\n'compare-fn' returns logical true, the clause's expression is\nevaluated and returned.  If 'compare-fn' returns false/nil, we go to\nthe next test value.\n\nIf 'test-expr-clauses' contains an odd number of items, the last\nitem is the default expression evaluated if no case-value matches.\nIf there is no default expression and no case-value matches, fcase\nreturns nil.\n\nSee specific forms of this macro in 'case' and 're-case'.\n\nThe test expressions in 'fcase' are always evaluated linearly, in\norder.  For a large number of case expressions it may be more\nefficient to use a hash lookup.",
   :name "fcase"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj#L103",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/in-case",
   :namespace "clojure.contrib.fcase",
   :line 103,
   :file "clojure/contrib/fcase.clj",
   :var-type "macro",
   :arglists ([test-value & clauses]),
   :doc
   "Like case, but test expressions are sequences.  The test expression\nis true if any item in the sequence is equal (tested with '=') to\nthe test value.",
   :name "in-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj#L93",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/instance-case",
   :namespace "clojure.contrib.fcase",
   :line 93,
   :file "clojure/contrib/fcase.clj",
   :var-type "macro",
   :arglists ([test-value & clauses]),
   :doc
   "Like case, but the test expressions are Java class names, tested with\n'instance?'.",
   :name "instance-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fcase.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fcase-api.html#clojure.contrib.fcase/re-case",
   :namespace "clojure.contrib.fcase",
   :line 87,
   :file "clojure/contrib/fcase.clj",
   :var-type "macro",
   :arglists ([test-value & clauses]),
   :doc
   "Like case, but the test expressions are regular expressions, tested\nwith re-find.",
   :name "re-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/clojure-source-file?",
   :namespace "clojure.contrib.find-namespaces",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([file]),
   :doc "Returns true if file is a normal file with a .clj extension.",
   :name "clojure-source-file?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/clojure-sources-in-jar",
   :namespace "clojure.contrib.find-namespaces",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "Returns a sequence of filenames ending in .clj found in the JAR file.",
   :name "clojure-sources-in-jar"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/comment?",
   :namespace "clojure.contrib.find-namespaces",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Returns true if form is a (comment ...)",
   :name "comment?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L34",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-clojure-sources-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :line 34,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "Searches recursively under dir for Clojure source files (.clj).\nReturns a sequence of File objects, in breadth-first sort order.",
   :name "find-clojure-sources-in-dir"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L79",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :name "find-namespaces-in-dir"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L112",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-in-jarfile",
   :namespace "clojure.contrib.find-namespaces",
   :line 112,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([jarfile]),
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :name "find-namespaces-in-jarfile"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L131",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-namespaces-on-classpath",
   :namespace "clojure.contrib.find-namespaces",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :name "find-namespaces-on-classpath"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-in-dir",
   :namespace "clojure.contrib.find-namespaces",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([dir]),
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :name "find-ns-decls-in-dir"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L104",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-in-jarfile",
   :namespace "clojure.contrib.find-namespaces",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([jarfile]),
   :doc
   "Searches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :name "find-ns-decls-in-jarfile"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L122",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/find-ns-decls-on-classpath",
   :namespace "clojure.contrib.find-namespaces",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Searches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the unevaluated ns declaration forms.",
   :name "find-ns-decls-on-classpath"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/ns-decl?",
   :namespace "clojure.contrib.find-namespaces",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Returns true if form is a (ns ...) declaration.",
   :name "ns-decl?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L65",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-file-ns-decl",
   :namespace "clojure.contrib.find-namespaces",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([file]),
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :name "read-file-ns-decl"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L52",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-ns-decl",
   :namespace "clojure.contrib.find-namespaces",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([rdr]),
   :doc
   "Attempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :name "read-ns-decl"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/find_namespaces.clj#L93",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//find-namespaces-api.html#clojure.contrib.find-namespaces/read-ns-decl-from-jarfile-entry",
   :namespace "clojure.contrib.find-namespaces",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/find_namespaces.clj",
   :var-type "function",
   :arglists ([jarfile entry-name]),
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :name "read-ns-decl-from-jarfile-entry"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/fnmap.clj#L19",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//fnmap-api.html#clojure.contrib.fnmap/fnmap",
   :namespace "clojure.contrib.fnmap",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/fnmap.clj",
   :var-type "function",
   :arglists ([getter setter] [getter setter & keyvals]),
   :doc
   "Creates a fnmap, or functional map.  A fnmap behaves like an\nordinary Clojure map, except that calls to get and assoc are\nfiltered through user-defined getter and setter functions, which\noperate on an internal map.\n\n(getter m key) should return a value for key.\n\n(setter m key value) should assoc key with value and return a new\nmap for m.\n\nAll other map operations are passed through to the internal map.",
   :name "fnmap"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/gen_html_docs.clj#L431",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//gen-html-docs-api.html#clojure.contrib.gen-html-docs/generate-documentation",
   :namespace "clojure.contrib.gen-html-docs",
   :line 431,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/gen_html_docs.clj",
   :var-type "function",
   :arglists ([libs]),
   :doc
   "Returns a string which is the HTML documentation for the libraries\nnamed by libs. Libs is a vector of symbols identifying Clojure\nlibraries.",
   :name "generate-documentation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/gen_html_docs.clj#L457",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//gen-html-docs-api.html#clojure.contrib.gen-html-docs/generate-documentation-to-file",
   :namespace "clojure.contrib.gen-html-docs",
   :line 457,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/gen_html_docs.clj",
   :var-type "function",
   :arglists ([path libs]),
   :doc
   "Calls generate-documentation on the libraries named by libs and\nemits the generated HTML to the path named by path.",
   :name "generate-documentation-to-file"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L111",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/*",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 111,
   :file "clojure/contrib/generic/arithmetic.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the product of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :name "*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L45",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/+",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 45,
   :file "clojure/contrib/generic/arithmetic.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the sum of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :name "+"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L77",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/-",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 77,
   :file "clojure/contrib/generic/arithmetic.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the difference of the first argument and the sum of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :name "-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L143",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic//",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 143,
   :file "clojure/contrib/generic/arithmetic.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the quotient of the first argument and the product of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :name "/"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L173",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/defmethod*",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 173,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/arithmetic.clj",
   :var-type "macro",
   :arglists ([ns name & args]),
   :doc
   "Define a method implementation for the multimethod name in namespace ns.\nRequired for implementing the division function from another namespace.",
   :name "defmethod*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/arithmetic.clj#L180",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.arithmetic-api.html#clojure.contrib.generic.arithmetic/qsym",
   :namespace "clojure.contrib.generic.arithmetic",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/arithmetic.clj",
   :var-type "macro",
   :arglists ([ns sym]),
   :doc
   "Create the qualified symbol corresponding to sym in namespace ns.\nRequired to access the division function from another namespace,\ne.g. as (qsym clojure.contrib.generic.arithmetic /).",
   :name "qsym"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L26",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/assoc",
   :namespace "clojure.contrib.generic.collection",
   :line 26,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([coll & key-val-pairs]),
   :doc
   "Returns a new collection in which the values corresponding to the\ngiven keys are updated by the given values. Each type of collection\ncan have specific restrictions on the possible keys.",
   :name "assoc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/conj",
   :namespace "clojure.contrib.generic.collection",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([coll & xs]),
   :doc
   "Returns a new collection resulting from adding all xs to coll.",
   :name "conj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/dissoc",
   :namespace "clojure.contrib.generic.collection",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([coll & keys]),
   :doc
   "Returns a new collection in which the entries corresponding to the\ngiven keys are removed. Each type of collection can have specific\nrestrictions on the possible keys.",
   :name "dissoc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L68",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/empty",
   :namespace "clojure.contrib.generic.collection",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([coll]),
   :doc "Returns an empty collection of the same kind as the argument",
   :name "empty"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L80",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/get",
   :namespace "clojure.contrib.generic.collection",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([coll key] [coll key not-found]),
   :doc
   "Returns the element of coll referred to by key. Each type of collection\ncan have specific restrictions on the possible keys.",
   :name "get"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L95",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/into",
   :namespace "clojure.contrib.generic.collection",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([to from]),
   :doc
   "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined.",
   :name "into"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/collection.clj#L109",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.collection-api.html#clojure.contrib.generic.collection/seq",
   :namespace "clojure.contrib.generic.collection",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/collection.clj",
   :var-type "multimethod",
   :arglists ([s]),
   :doc "Returns a seq on the object s.",
   :name "seq"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/<",
   :namespace "clojure.contrib.generic.comparison",
   :line 87,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is smaller than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :name "<"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L139",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/<=",
   :namespace "clojure.contrib.generic.comparison",
   :line 139,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each arguments is smaller than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :name "<="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/=",
   :namespace "clojure.contrib.generic.comparison",
   :line 46,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if all arguments are equal. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :name "="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/>",
   :namespace "clojure.contrib.generic.comparison",
   :line 66,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is larger than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type].",
   :name ">"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L113",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/>=",
   :namespace "clojure.contrib.generic.comparison",
   :line 113,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is larger than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of <.",
   :name ">="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L200",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/max",
   :namespace "clojure.contrib.generic.comparison",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/comparison.clj",
   :var-type "function",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Returns the greatest of its arguments. Like clojure.core/max except that\nis uses generic comparison functions implementable for any data type.",
   :name "max"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L208",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/min",
   :namespace "clojure.contrib.generic.comparison",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/comparison.clj",
   :var-type "function",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Returns the least of its arguments. Like clojure.core/min except that\nis uses generic comparison functions implementable for any data type.",
   :name "min"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/neg?",
   :namespace "clojure.contrib.generic.comparison",
   :line 38,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is negative.",
   :name "neg?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/pos?",
   :namespace "clojure.contrib.generic.comparison",
   :line 33,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is positive.",
   :name "pos?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/comparison.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.comparison-api.html#clojure.contrib.generic.comparison/zero?",
   :namespace "clojure.contrib.generic.comparison",
   :line 28,
   :file "clojure/contrib/generic/comparison.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is zero.",
   :name "zero?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/functor.clj#L20",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.functor-api.html#clojure.contrib.generic.functor/fmap",
   :namespace "clojure.contrib.generic.functor",
   :line 20,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/functor.clj",
   :var-type "multimethod",
   :arglists ([f s]),
   :doc
   "Applies function f to each item in the data structure s and returns\na structure of the same kind.",
   :name "fmap"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L53",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/abs",
   :namespace "clojure.contrib.generic.math-functions",
   :line 53,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the abs of x.",
   :name "abs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/acos",
   :namespace "clojure.contrib.generic.math-functions",
   :line 54,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the acos of x.",
   :name "acos"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L110",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/approx=",
   :namespace "clojure.contrib.generic.math-functions",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/generic/math_functions.clj",
   :var-type "function",
   :arglists ([x y eps]),
   :doc
   "Return true if the absolute value of the difference between x and y\nis less than eps.",
   :name "approx="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L55",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/asin",
   :namespace "clojure.contrib.generic.math-functions",
   :line 55,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the asin of x.",
   :name "asin"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/atan",
   :namespace "clojure.contrib.generic.math-functions",
   :line 56,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the atan of x.",
   :name "atan"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/atan2",
   :namespace "clojure.contrib.generic.math-functions",
   :line 57,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x y]),
   :doc "Return the atan2 of x and y.",
   :name "atan2"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L58",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/ceil",
   :namespace "clojure.contrib.generic.math-functions",
   :line 58,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the ceil of x.",
   :name "ceil"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/conjugate",
   :namespace "clojure.contrib.generic.math-functions",
   :line 87,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the conjugate of x.",
   :name "conjugate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/cos",
   :namespace "clojure.contrib.generic.math-functions",
   :line 59,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the cos of x.",
   :name "cos"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L60",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/exp",
   :namespace "clojure.contrib.generic.math-functions",
   :line 60,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the exp of x.",
   :name "exp"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L61",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/floor",
   :namespace "clojure.contrib.generic.math-functions",
   :line 61,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the floor of x.",
   :name "floor"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/log",
   :namespace "clojure.contrib.generic.math-functions",
   :line 62,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the log of x.",
   :name "log"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/pow",
   :namespace "clojure.contrib.generic.math-functions",
   :line 63,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x y]),
   :doc "Return the pow of x and y.",
   :name "pow"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L64",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/rint",
   :namespace "clojure.contrib.generic.math-functions",
   :line 64,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the rint of x.",
   :name "rint"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L65",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/round",
   :namespace "clojure.contrib.generic.math-functions",
   :line 65,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the round of x.",
   :name "round"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/sgn",
   :namespace "clojure.contrib.generic.math-functions",
   :line 73,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sign of x (-1, 0, or 1).",
   :name "sgn"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/sin",
   :namespace "clojure.contrib.generic.math-functions",
   :line 66,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sin of x.",
   :name "sin"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L98",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/sqr",
   :namespace "clojure.contrib.generic.math-functions",
   :line 98,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the square of x.",
   :name "sqr"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L67",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/sqrt",
   :namespace "clojure.contrib.generic.math-functions",
   :line 67,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sqrt of x.",
   :name "sqrt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/generic/math_functions.clj#L68",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//generic.math-functions-api.html#clojure.contrib.generic.math-functions/tan",
   :namespace "clojure.contrib.generic.math-functions",
   :line 68,
   :file "clojure/contrib/generic/math_functions.clj",
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the tan of x.",
   :name "tan"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/add-loops",
   :namespace "clojure.contrib.graph",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc "For each node n, add the edge n->n if not already present.",
   :name "add-loops"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L133",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/component-graph",
   :namespace "clojure.contrib.graph",
   :line 133,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g] [g sccs]),
   :doc
   "Given a graph, perhaps with cycles, return a reduced graph that is acyclic.\nEach node in the new graph will be a set of nodes from the old.\nThese sets are the strongly connected components.  Each edge will\nbe the union of the corresponding edges of the prior graph.",
   :name "component-graph"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L190",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/dependency-list",
   :namespace "clojure.contrib.graph",
   :line 190,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Similar to a topological sort, this returns a vector of sets. The\nset of nodes at index 0 are independent.  The set at index 1 depend\non index 0; those at 2 depend on 0 and 1, and so on.  Those withing\na set have no mutual dependencies.  Assume the input graph (which\nmuch be acyclic) has an edge a->b when a depends on b.",
   :name "dependency-list"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L167",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/fixed-point",
   :namespace "clojure.contrib.graph",
   :line 167,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([data fun max equal]),
   :doc
   "Repeatedly apply fun to data until (equal old-data new-data)\nreturns true.  If max iterations occur, it will throw an\nexception.  Set max to nil for unlimited iterations.",
   :name "fixed-point"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/get-neighbors",
   :namespace "clojure.contrib.graph",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g n]),
   :doc "Get the neighbors of a node.",
   :name "get-neighbors"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L68",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/lazy-walk",
   :namespace "clojure.contrib.graph",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g n] [g ns v]),
   :doc
   "Return a lazy sequence of the nodes of a graph starting a node n.  Optionally,\nprovide a set of visited notes (v) and a collection of nodes to\nvisit (ns).",
   :name "lazy-walk"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L110",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/post-ordered-nodes",
   :namespace "clojure.contrib.graph",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Return a sequence of indexes of a post-ordered walk of the graph.",
   :name "post-ordered-nodes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L151",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/recursive-component?",
   :namespace "clojure.contrib.graph",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g ns]),
   :doc "Is the component (recieved from scc) self recursive?",
   :name "recursive-component?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/remove-loops",
   :namespace "clojure.contrib.graph",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc "For each node n, remove any edges n->n.",
   :name "remove-loops"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L37",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/reverse-graph",
   :namespace "clojure.contrib.graph",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Given a directed graph, return another directed graph with the\norder of the edges reversed.",
   :name "reverse-graph"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L117",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/scc",
   :namespace "clojure.contrib.graph",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns, as a sequence of sets, the strongly connected components\nof g.",
   :name "scc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L158",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/self-recursive-sets",
   :namespace "clojure.contrib.graph",
   :line 158,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns, as a sequence of sets, the components of a graph that are\nself-recursive.",
   :name "self-recursive-sets"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L207",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/stratification-list",
   :namespace "clojure.contrib.graph",
   :line 207,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g1 g2]),
   :doc
   "Similar to dependency-list (see doc), except two graphs are\nprovided.  The first is as dependency-list.  The second (which may\nhave cycles) provides a partial-dependency relation.  If node a\ndepends on node b (meaning an edge a->b exists) in the second\ngraph, node a must be equal or later in the sequence.",
   :name "stratification-list"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/graph.clj#L81",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//graph-api.html#clojure.contrib.graph/transitive-closure",
   :namespace "clojure.contrib.graph",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/graph.clj",
   :var-type "function",
   :arglists ([g]),
   :doc
   "Returns the transitive closure of a graph.  The neighbors are lazily computed.\n\nNote: some version of this algorithm return all edges a->a\nregardless of whether such loops exist in the original graph.  This\nversion does not.  Loops will be included only if produced by\ncycles in the graph.  If you have code that depends on such\nbehavior, call (-> g transitive-closure add-loops)",
   :name "transitive-closure"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L52",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-greatest",
   :namespace "clojure.contrib.greatest-least",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc "Returns all the greatest elements.",
   :name "all-greatest"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-greatest-by",
   :namespace "clojure.contrib.greatest-least",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([f & args]),
   :doc
   "Return all the elements for which f yields the greatest value.",
   :name "all-greatest-by"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-least",
   :namespace "clojure.contrib.greatest-least",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc "Returns all the least elements.",
   :name "all-least"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/all-least-by",
   :namespace "clojure.contrib.greatest-least",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([f & args]),
   :doc "Return all the elements for which f yields the least value.",
   :name "all-least-by"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/greatest",
   :namespace "clojure.contrib.greatest-least",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc "Return the greatest argument.",
   :name "greatest"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L13",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/greatest-by",
   :namespace "clojure.contrib.greatest-least",
   :line 13,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([f & args]),
   :doc "Return the argument for which f yields the greatest value.",
   :name "greatest-by"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/least",
   :namespace "clojure.contrib.greatest-least",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc "Return the smallest element.",
   :name "least"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/greatest_least.clj#L23",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//greatest-least-api.html#clojure.contrib.greatest-least/least-by",
   :namespace "clojure.contrib.greatest-least",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/greatest_least.clj",
   :var-type "function",
   :arglists ([f & args]),
   :doc "Return the argument for which f yields the smallest value.",
   :name "least-by"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L154",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/buffer-bytes",
   :namespace "clojure.contrib.http.agent",
   :line 154,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "The default HTTP agent result handler; it collects the response\nbody in a java.io.ByteArrayOutputStream, which can later be\nretrieved with the 'stream', 'string', and 'bytes' functions.",
   :name "buffer-bytes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L260",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/bytes",
   :namespace "clojure.contrib.http.agent",
   :line 260,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns a Java byte array of the content returned by the server;\nnil if the content is not yet available.",
   :name "bytes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L371",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/client-error?",
   :namespace "clojure.contrib.http.agent",
   :line 371,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns true if the HTTP response code was in the 400-499 range.",
   :name "client-error?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L310",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/done?",
   :namespace "clojure.contrib.http.agent",
   :line 310,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc "Returns true if the HTTP request/response has completed.",
   :name "done?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L381",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/error?",
   :namespace "clojure.contrib.http.agent",
   :line 381,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns true if the HTTP response code was in the 400-499 range OR\nthe 500-599 range.",
   :name "error?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L331",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/headers",
   :namespace "clojure.contrib.http.agent",
   :line 331,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns a map of HTTP response headers.  Header names are converted\nto keywords in all lower-case Header values are strings.  If a\nheader appears more than once, only the last value is returned.",
   :name "headers"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L341",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/headers-seq",
   :namespace "clojure.contrib.http.agent",
   :line 341,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the HTTP response headers in order as a sequence of\n[String,String] pairs.  The first 'header' name may be null for the\nHTTP status line.",
   :name "headers-seq"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L175",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/http-agent",
   :namespace "clojure.contrib.http.agent",
   :line 175,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([uri & options]),
   :doc
   "Creates (and immediately returns) an Agent representing an HTTP\nrequest running in a new thread.\n\noptions are key/value pairs:\n\n:method string\n\nThe HTTP method name.  Default is \"GET\".\n\n:headers h\n\nHTTP headers, as a Map or a sequence of pairs like \n([key1,value1], [key2,value2])  Default is nil.\n\n:body b\n\nHTTP request entity body, one of nil, String, byte[], InputStream,\nReader, or File.  Default is nil.\n\n:connect-timeout int\n\nTimeout value, in milliseconds, when opening a connection to the\nURL.  Default is zero, meaning no timeout.\n\n:read-timeout int\n\nTimeout value, in milliseconds, when reading data from the\nconnection.  Default is zero, meaning no timeout.\n\n:follow-redirects boolean\n\nIf true, HTTP 3xx redirects will be followed automatically.  Default\nis true.\n\n:handler f\n\nFunction to be called when the HTTP response body is ready.  If you\ndo not provide a handler function, the default is to buffer the\nentire response body in memory.\n\nThe handler function will be called with the HTTP agent as its\nargument, and can use the 'stream' function to read the response\nbody.  The return value of this function will be stored in the state\nof the agent and can be retrieved with the 'result' function.  Any\nexceptions thrown by this function will be added to the agent's\nerror queue (see agent-errors).  The default function collects the\nresponse stream in a memory buffer.\n",
   :name "http-agent"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L324",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/message",
   :namespace "clojure.contrib.http.agent",
   :line 324,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the HTTP response message (e.g. 'Not Found'), for this\nrequest, or nil if the response has not yet been received.",
   :name "message"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L294",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/method",
   :namespace "clojure.contrib.http.agent",
   :line 294,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the HTTP method name used by this HTTP agent, as a String.",
   :name "method"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L362",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/redirect?",
   :namespace "clojure.contrib.http.agent",
   :line 362,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns true if the HTTP response code was in the 300-399 range.\n\nNote: if the :follow-redirects option was true (the default),\nredirects will be followed automatically and a the agent will never\nreturn a 3xx response code.",
   :name "redirect?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L299",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/request-body",
   :namespace "clojure.contrib.http.agent",
   :line 299,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the HTTP request body given to this HTTP agent.  \n\nNote: if the request body was an InputStream or a Reader, it will no\nlonger be usable.",
   :name "request-body"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L289",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/request-headers",
   :namespace "clojure.contrib.http.agent",
   :line 289,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc "Returns the request headers specified for this HTTP agent.",
   :name "request-headers"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L284",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/request-uri",
   :namespace "clojure.contrib.http.agent",
   :line 284,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the URI/URL requested by this HTTP agent, as a String.",
   :name "request-uri"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L238",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/result",
   :namespace "clojure.contrib.http.agent",
   :line 238,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the value returned by the :handler function of the HTTP\nagent; blocks until the HTTP request is completed.  The default\nhandler function returns a ByteArrayOutputStream.",
   :name "result"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L376",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/server-error?",
   :namespace "clojure.contrib.http.agent",
   :line 376,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns true if the HTTP response code was in the 500-599 range.",
   :name "server-error?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L316",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/status",
   :namespace "clojure.contrib.http.agent",
   :line 316,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns the HTTP response status code (e.g. 200, 404) for this\nrequest, as an Integer, or nil if the status has not yet been\nreceived.",
   :name "status"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/stream",
   :namespace "clojure.contrib.http.agent",
   :line 246,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns an InputStream of the HTTP response body.  When called by\nthe handler function passed to http-agent, this is the raw\nHttpURLConnection stream.\n\nIf the default handler function was used, this function returns a\nByteArrayInputStream on the buffered response body.",
   :name "stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L266",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/string",
   :namespace "clojure.contrib.http.agent",
   :line 266,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt] [http-agnt encoding]),
   :doc
   "Returns the HTTP response body as a string, using the given\nencoding.\n\nIf no encoding is given, uses the encoding specified in the server\nheaders, or clojure.contrib.io/*default-encoding* if it is\nnot specified.",
   :name "string"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/agent.clj#L357",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.agent-api.html#clojure.contrib.http.agent/success?",
   :namespace "clojure.contrib.http.agent",
   :line 357,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/agent.clj",
   :var-type "function",
   :arglists ([http-agnt]),
   :doc
   "Returns true if the HTTP response code was in the 200-299 range.",
   :name "success?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/connection.clj#L24",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.connection-api.html#clojure.contrib.http.connection/http-connection",
   :namespace "clojure.contrib.http.connection",
   :line 24,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/connection.clj",
   :var-type "function",
   :arglists ([url]),
   :doc "Opens an HttpURLConnection at the URL, handled by as-url.",
   :name "http-connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/0a3e6804f9822a85e255650e2be35c757d4c1e3d/src/main/clojure/clojure/contrib/http/connection.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//http.connection-api.html#clojure.contrib.http.connection/send-request-entity",
   :namespace "clojure.contrib.http.connection",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/http/connection.clj",
   :var-type "var",
   :doc "Transmits a request entity body.",
   :name "send-request-entity"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/import_static.clj#L22",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//import-static-api.html#clojure.contrib.import-static/import-static",
   :namespace "clojure.contrib.import-static",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/import_static.clj",
   :var-type "macro",
   :arglists ([class & fields-and-methods]),
   :doc
   "Imports the named static fields and/or static methods of the class\nas (private) symbols in the current namespace.\n\nExample: \n    user=> (import-static java.lang.Math PI sqrt)\n    nil\n    user=> PI\n    3.141592653589793\n    user=> (sqrt 16)\n    4.0\n\nNote: The class name must be fully qualified, even if it has already\nbeen imported.  Static methods are defined as MACROS, not\nfirst-class fns.",
   :name "import-static"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L107",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/*append*",
   :namespace "clojure.contrib.io",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "var",
   :doc
   "If true, writer, output-stream and spit will open files in append mode.\nDefaults to false.  Instead of binding this var directly, use append-writer,\nappend-output-stream or append-spit.",
   :name "*append*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L79",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/*buffer-size*",
   :namespace "clojure.contrib.io",
   :line 79,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "var",
   :doc
   "Size, in bytes or characters, of the buffer used when\ncopying streams.",
   :name "*buffer-size*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L84",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/*byte-array-type*",
   :namespace "clojure.contrib.io",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "var",
   :doc "Type object for a Java primitive byte array.",
   :name "*byte-array-type*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/*char-array-type*",
   :namespace "clojure.contrib.io",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "var",
   :doc "Type object for a Java primitive char array.",
   :name "*char-array-type*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/*default-encoding*",
   :namespace "clojure.contrib.io",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "var",
   :doc
   "Name of the default encoding to use when reading & writing.\nDefault is UTF-8.",
   :name "*default-encoding*"}
  {:arglists ([x]),
   :name "append-output-stream",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L280",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/append-output-stream",
   :doc
   "Like output-stream but opens file for appending.  Does not work on streams\nthat are already open.",
   :var-type "function",
   :line 280,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:arglists ([f content]),
   :name "append-spit",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L338",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/append-spit",
   :doc "Like spit but appends to file.",
   :var-type "function",
   :line 338,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:arglists ([x]),
   :name "append-writer",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L288",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/append-writer",
   :doc
   "Like writer but opens file for appending.  Does not work on streams\nthat are already open.",
   :var-type "function",
   :line 288,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:arglists ([arg]),
   :name "as-url",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L552",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/as-url",
   :doc "Coerces argument (URL, URI, or String) to a java.net.URL.",
   :var-type "function",
   :line 552,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:arglists ([input output]),
   :name "copy",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L375",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/copy",
   :doc
   "Copies input to output.  Returns nil.\nInput may be an InputStream, Reader, File, byte[], or String.\nOutput may be an OutputStream, Writer, or File.\n\nDoes not close any streams except those it opens itself \n(on a File).\n\nWriting a File fails if the parent directory does not exist.",
   :var-type "function",
   :line 375,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L535",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/delete-file",
   :namespace "clojure.contrib.io",
   :line 535,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([f & [silently]]),
   :doc
   "Delete file f. Raise an exception if it fails unless silently is true.",
   :name "delete-file"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L542",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/delete-file-recursively",
   :namespace "clojure.contrib.io",
   :line 542,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([f & [silently]]),
   :doc
   "Delete file f. If it's a directory, recursively delete all its contents.\nRaise an exception if any deletion fails unless silently is true.",
   :name "delete-file-recursively"}
  {:arglists ([arg] [parent child] [parent child & more]),
   :name "file",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L525",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/file",
   :doc "Returns a java.io.File from string or file args.",
   :var-type "function",
   :line 525,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L93",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/file-str",
   :namespace "clojure.contrib.io",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Concatenates args as strings and returns a java.io.File.  Replaces\nall / and \\ with File/separatorChar.  Replaces ~ at the start of\nthe path with the user.home system property.",
   :name "file-str"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/input-stream",
   :namespace "clojure.contrib.io",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open java.io.InputStream.\nThe default implementations of this protocol always return a\njava.io.BufferedInputStream.\n\nDefault implementations are defined for OutputStream, File, URI, URL,\nSocket, byte array, and String arguments.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the InputStream is properly\nclosed.",
   :name "input-stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L471",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/make-parents",
   :namespace "clojure.contrib.io",
   :line 471,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([file]),
   :doc "Creates all parent directories of file.",
   :name "make-parents"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/output-stream",
   :namespace "clojure.contrib.io",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open java.io.OutputStream.\nThe default implementations of this protocol always return a\njava.io.BufferedOutputStream.\n\nDefault implementations are defined for OutputStream, File, URI, URL,\nSocket, and String arguments.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the OutputStream is\nproperly closed.",
   :name "output-stream"}
  {:arglists ([]),
   :name "pwd",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L345",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/pwd",
   :doc
   "Returns current working directory as a String.  (Like UNIX 'pwd'.)\nNote: In Java, you cannot change the current working directory.",
   :var-type "function",
   :line 345,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L307",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/read-lines",
   :namespace "clojure.contrib.io",
   :line 307,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "Like clojure.core/line-seq but opens f with reader.  Automatically\ncloses the reader AFTER YOU CONSUME THE ENTIRE SEQUENCE.",
   :name "read-lines"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/reader",
   :namespace "clojure.contrib.io",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open java.io.Reader.\nThe default implementations of this protocol always return a\njava.io.BufferedReader.\n\nDefault implementations are provided for Reader, BufferedReader,\nInputStream, File, URI, URL, Socket, byte arrays, character arrays,\nand String.\n\nIf argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.  If this fails, a final attempt is made to resolve\nthe string as a resource on the CLASSPATH.\n\nUses *default-encoding* as the text encoding.\n\nShould be used inside with-open to ensure the Reader is properly\nclosed.",
   :name "reader"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L502",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/relative-path-string",
   :namespace "clojure.contrib.io",
   :deprecated "1.2",
   :line 502,
   :file "clojure/contrib/io.clj",
   :var-type "multimethod",
   :doc
   "Interpret a String or java.io.File as a relative path string. \nBuilding block for clojure.contrib.java/file.",
   :name "relative-path-string"}
  {:arglists ([f]),
   :name "slurp*",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L318",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/slurp*",
   :doc "Like clojure.core/slurp but opens f with reader.",
   :var-type "function",
   :line 318,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:arglists ([f content]),
   :name "spit",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L330",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/spit",
   :doc
   "Opposite of slurp.  Opens f with writer, writes content, then\ncloses f.",
   :var-type "function",
   :line 330,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L476",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/to-byte-array",
   :namespace "clojure.contrib.io",
   :line 476,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([arg]),
   :doc
   "Converts argument into a Java byte array.  Argument may be\na String, File, InputStream, or Reader.  If the argument is already\na byte array, returns it.",
   :name "to-byte-array"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L368",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/with-in-reader",
   :namespace "clojure.contrib.io",
   :line 368,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "macro",
   :arglists ([f & body]),
   :doc
   "Opens a PushbackReader on f, binds it to *in*, and evaluates body.",
   :name "with-in-reader"}
  {:arglists ([f & body]),
   :name "with-out-append-writer",
   :namespace "clojure.contrib.io",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L360",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/with-out-append-writer",
   :doc "Like with-out-writer but appends to file.",
   :var-type "macro",
   :line 360,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L352",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/with-out-writer",
   :namespace "clojure.contrib.io",
   :line 352,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "macro",
   :arglists ([f & body]),
   :doc
   "Opens a writer on f, binds it to *out*, and evalutes body.\nAnything printed within body will be written to f.",
   :name "with-out-writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b6c6f0fa165975c416c7d135d1a844353527493b/src/main/clojure/clojure/contrib/io.clj#L296",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/write-lines",
   :namespace "clojure.contrib.io",
   :line 296,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/io.clj",
   :var-type "function",
   :arglists ([f lines]),
   :doc
   "Writes lines (a seq) to f, separated by newlines.  f is opened with\nwriter, and automatically closed at the end of the sequence.",
   :name "write-lines"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//io-api.html#clojure.contrib.io/writer",
   :namespace "clojure.contrib.io",
   :var-type "function",
   :arglists ([x]),
   :doc
   "Attempts to coerce its argument into an open java.io.Writer.\nThe default implementations of this protocol always return a\njava.io.BufferedWriter.\n\nDefault implementations are provided for Writer, BufferedWriter,\nOutputStream, File, URI, URL, Socket, and String.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the Writer is properly\nclosed.",
   :name "writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jar.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jar-api.html#clojure.contrib.jar/filenames-in-jar",
   :namespace "clojure.contrib.jar",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jar.clj",
   :var-type "function",
   :arglists ([jar-file]),
   :doc
   "Returns a sequence of Strings naming the non-directory entries in\nthe JAR file.",
   :name "filenames-in-jar"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jar.clj#L22",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jar-api.html#clojure.contrib.jar/jar-file?",
   :namespace "clojure.contrib.jar",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jar.clj",
   :var-type "function",
   :arglists ([file]),
   :doc
   "Returns true if file is a normal file with a .jar or .JAR extension.",
   :name "jar-file?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/as-file",
   :namespace "clojure.contrib.java-utils",
   :deprecated "1.2",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "multimethod",
   :doc
   "Interpret a String or a java.io.File as a File. Building block\nfor clojure.contrib.java-utils/file, which you should prefer\nin most cases.",
   :name "as-file"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L143",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/as-properties",
   :namespace "clojure.contrib.java-utils",
   :line 143,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "Convert any seq of pairs to a java.utils.Properties instance.\nUses as-str to convert both keys and values into strings.",
   :name "as-properties"}
  {:arglists ([] [x] [x & ys]),
   :name "as-str",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L82",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/as-str",
   :doc
   "Like clojure.core/str, but if an argument is a keyword or symbol,\nits name will be used instead of its literal representation.\n\nExample:\n   (str :foo :bar)     ;;=> \":foo:bar\"\n   (as-str :foo :bar)  ;;=> \"foobar\" \n\nNote that this does not apply to keywords or symbols nested within\ndata structures; they will be rendered as with str.\n\nExample:\n   (str {:foo :bar})     ;;=> \"{:foo :bar}\"\n   (as-str {:foo :bar})  ;;=> \"{:foo :bar}\" ",
   :var-type "function",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([arg]),
   :name "as-url",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L188",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/as-url",
   :doc "Coerces argument (URL, URI, or String) to a java.net.URL.",
   :var-type "multimethod",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([f & [silently]]),
   :name "delete-file",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L169",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/delete-file",
   :doc
   "Delete file f. Raise an exception if it fails unless silently is true.",
   :var-type "function",
   :line 169,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([f & [silently]]),
   :name "delete-file-recursively",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L177",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/delete-file-recursively",
   :doc
   "Delete file f. If it's a directory, recursively delete all its contents.\nRaise an exception if any deletion fails unless silently is true.",
   :var-type "function",
   :line 177,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([arg] [parent child] [parent child & more]),
   :name "file",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L72",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/file",
   :doc "Returns a java.io.File from string or file args.",
   :var-type "function",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L108",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/get-system-property",
   :namespace "clojure.contrib.java-utils",
   :line 108,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "function",
   :arglists ([stringable] [stringable default]),
   :doc "Get a system property.",
   :name "get-system-property"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L153",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/read-properties",
   :namespace "clojure.contrib.java-utils",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "function",
   :arglists ([file-able]),
   :doc "Read properties from file-able.",
   :name "read-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/relative-path-string",
   :namespace "clojure.contrib.java-utils",
   :deprecated "1.2",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "multimethod",
   :doc
   "Interpret a String or java.io.File as a relative path string. \nBuilding block for clojure.contrib.java-utils/file.",
   :name "relative-path-string"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L115",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/set-system-properties",
   :namespace "clojure.contrib.java-utils",
   :line 115,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "function",
   :arglists ([settings]),
   :doc "Set some system properties. Nil clears a property.",
   :name "set-system-properties"}
  {:arglists ([class-name field-name obj]),
   :name "wall-hack-field",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L213",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/wall-hack-field",
   :doc "Access to private or protected field.",
   :var-type "function",
   :line 213,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:arglists ([class-name method-name params obj & args]),
   :name "wall-hack-method",
   :namespace "clojure.contrib.java-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L202",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/wall-hack-method",
   :doc
   "Calls a private or protected method.\nparams is a vector of class which correspond to the arguments to the method\nobj is nil for static methods, the instance object otherwise\nthe method name is given as a symbol or a keyword (something Named)",
   :var-type "function",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L123",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/with-system-properties",
   :namespace "clojure.contrib.java-utils",
   :line 123,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "macro",
   :arglists ([settings & body]),
   :doc
   "setting => property-name value\n\nSets the system properties to the supplied values, executes the body, and\nsets the properties back to their original values. Values of nil are\ntranslated to a clearing of the property.",
   :name "with-system-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b7c64bb25d0c1e5cd28a8001c14986f34b95a1cf/src/main/clojure/clojure/contrib/java_utils.clj#L160",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//java-utils-api.html#clojure.contrib.java-utils/write-properties",
   :namespace "clojure.contrib.java-utils",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/java_utils.clj",
   :var-type "function",
   :arglists ([m file-able] [m file-able comments]),
   :doc "Write properties to file-able.",
   :name "write-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7b29eaf7de0d042a9fedc837322c449fa7a03c7e/src/main/clojure/clojure/contrib/javadoc/browse.clj#L26",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//javadoc.browse-api.html#clojure.contrib.javadoc.browse/open-url-in-browser",
   :namespace "clojure.contrib.javadoc.browse",
   :line 26,
   :file "clojure/contrib/javadoc/browse.clj",
   :var-type "function",
   :arglists ([url]),
   :doc
   "Opens url (a string) in the default system web browser.  May not\nwork on all platforms.  Returns url on success, nil if not\nsupported.",
   :name "open-url-in-browser"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7b29eaf7de0d042a9fedc837322c449fa7a03c7e/src/main/clojure/clojure/contrib/javadoc/browse.clj#L41",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//javadoc.browse-api.html#clojure.contrib.javadoc.browse/open-url-in-swing",
   :namespace "clojure.contrib.javadoc.browse",
   :line 41,
   :file "clojure/contrib/javadoc/browse.clj",
   :var-type "function",
   :arglists ([url]),
   :doc "Opens url (a string) in a Swing window.",
   :name "open-url-in-swing"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj#L83",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/*connection*",
   :namespace "clojure.contrib.jmx",
   :line 83,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx.clj",
   :var-type "var",
   :doc
   "The connection to be used for JMX ops. Defaults to the local process.",
   :name "*connection*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L26",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/as-object-name",
   :namespace "clojure.contrib.jmx",
   :line 26,
   :file "clojure/contrib/jmx/data.clj",
   :var-type "multimethod",
   :arglists ([string-or-name]),
   :doc "Interpret an object as a JMX ObjectName.",
   :name "as-object-name"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L60",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/attribute-info",
   :namespace "clojure.contrib.jmx",
   :line 60,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([object-name attr-name]),
   :doc "Get the MBeanAttributeInfo for an attribute.",
   :name "attribute-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj#L95",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/attribute-names",
   :namespace "clojure.contrib.jmx",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "All attribute names available on an MBean.",
   :name "attribute-names"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L91",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/build-attribute-info",
   :namespace "clojure.contrib.jmx",
   :line 91,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists
   ([attr-name attr-value] [name type desc readable? writable? is?]),
   :doc
   "Construct an MBeanAttributeInfo. Normally called with a key/value pair from a Clojure map.",
   :name "build-attribute-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L85",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/guess-attribute-typename",
   :namespace "clojure.contrib.jmx",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists ([value]),
   :doc
   "Guess the attribute typename for MBeanAttributeInfo based on the attribute value.",
   :name "guess-attribute-typename"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L64",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/jmx->clj",
   :namespace "clojure.contrib.jmx",
   :line 64,
   :file "clojure/contrib/jmx/data.clj",
   :var-type "multimethod",
   :doc
   "Coerce JMX data structures into Clojure data.\nHandles CompositeData, TabularData, maps, and atoms.",
   :name "jmx->clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L19",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/jmx-url",
   :namespace "clojure.contrib.jmx",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists ([] [overrides]),
   :doc "Build a JMX URL from options.",
   :name "jmx-url"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L100",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/map->attribute-infos",
   :namespace "clojure.contrib.jmx",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists ([attr-map]),
   :doc
   "Construct an MBeanAttributeInfo[] from a Clojure associative.",
   :name "map->attribute-infos"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L44",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/maybe-atomize",
   :namespace "clojure.contrib.jmx",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists ([k]),
   :doc
   "Convert a list of length 1 into its contents, leaving other things alone.\nUsed to simplify keys in the tabular data API.",
   :name "maybe-atomize"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6cfd3b286680fd59021382fdc516be6be82a8834/src/main/clojure/clojure/contrib/jmx/data.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/maybe-keywordize",
   :namespace "clojure.contrib.jmx",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/data.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Convert a string key to a keyword, leaving other types alone. Used to\nsimplify keys in the tabular data API.",
   :name "maybe-keywordize"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj#L114",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/mbean",
   :namespace "clojure.contrib.jmx",
   :line 114,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx.clj",
   :var-type "function",
   :arglists ([n]),
   :doc
   "Like clojure.core/bean, but for JMX beans. Returns a read-only map of\na JMX bean's attributes. If an attribute it not supported, value is\nset to the exception thrown.",
   :name "mbean"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/mbean-names",
   :namespace "clojure.contrib.jmx",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx.clj",
   :var-type "function",
   :arglists ([n]),
   :doc
   "Finds all MBeans matching a name on the current *connection*.",
   :name "mbean-names"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L81",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/op-param-types",
   :namespace "clojure.contrib.jmx",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n op]),
   :doc
   "The parameter types (as class name strings) for operation op on n.\nUsed for invoke.",
   :name "op-param-types"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L76",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operation",
   :namespace "clojure.contrib.jmx",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n op]),
   :doc
   "The MBeanOperationInfo for operation op on mbean n. Used by invoke.",
   :name "operation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/jmx.clj#L101",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operation-names",
   :namespace "clojure.contrib.jmx",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "All operation names available on an MBean.",
   :name "operation-names"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/operations",
   :namespace "clojure.contrib.jmx",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "All oeprations available on an MBean.",
   :name "operations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/raw-read",
   :namespace "clojure.contrib.jmx",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n attr]),
   :doc
   "Read an mbean property. Returns low-level Java object model for\ncomposites, tabulars, etc. Most callers should use read.",
   :name "raw-read"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L39",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/read",
   :namespace "clojure.contrib.jmx",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "var",
   :doc "Read an mbean property.",
   :name "read"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L43",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/read-supported",
   :namespace "clojure.contrib.jmx",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n attr]),
   :doc
   "Calls read to read an mbean property, *returning* unsupported\noperation exceptions instead of throwing them. Used to keep mbean\nfrom blowing up. Note: There is no good exception that aggregates\nunsupported operations, hence the overly-general catch block.",
   :name "read-supported"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/readable?",
   :namespace "clojure.contrib.jmx",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "function",
   :arglists ([n attr]),
   :doc "Is attribute readable?",
   :name "readable?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/d157d6487e8c04979850b8d572cb0341613d97c1/src/main/clojure/clojure/contrib/jmx/client.clj#L17",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//jmx-api.html#clojure.contrib.jmx/with-connection",
   :namespace "clojure.contrib.jmx",
   :line 17,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/jmx/client.clj",
   :var-type "macro",
   :arglists ([opts & body]),
   :doc
   "Execute body with JMX connection specified by opts. opts can also\ninclude an optional :environment key which is passed as the\nenvironment arg to JMXConnectorFactory/connect.",
   :name "with-connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/json.clj#L301",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/json-str",
   :namespace "clojure.contrib.json",
   :line 301,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/json.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Converts x to a JSON-formatted string.",
   :name "json-str"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/json.clj#L338",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/pprint-json",
   :namespace "clojure.contrib.json",
   :line 338,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/json.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Pretty-prints JSON representation of x to *out*",
   :name "pprint-json"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/json.clj#L309",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/print-json",
   :namespace "clojure.contrib.json",
   :line 309,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/json.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Write JSON-formatted output to *out*",
   :name "print-json"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/json.clj#L189",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/read-json",
   :namespace "clojure.contrib.json",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/json.clj",
   :var-type "function",
   :arglists
   ([input]
    [input keywordize?]
    [input keywordize? eof-error? eof-value]),
   :doc
   "Reads one JSON value from input String or Reader.\nIf keywordize? is true (default), object keys will be converted to\nkeywords.  If eof-error? is true (default), empty input will throw\nan EOFException; if false EOF will return eof-value. ",
   :name "read-json"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/read-json-from",
   :namespace "clojure.contrib.json",
   :var-type "function",
   :arglists ([input keywordize? eof-error? eof-value]),
   :doc
   "Reads one JSON value from input String or Reader.\nIf keywordize? is true, object keys will be converted to keywords.\nIf eof-error? is true, empty input will throw an EOFException; if\nfalse EOF will return eof-value. ",
   :name "read-json-from"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//json-api.html#clojure.contrib.json/write-json",
   :namespace "clojure.contrib.json",
   :var-type "function",
   :arglists ([object out]),
   :doc "Print object to PrintWriter out as JSON",
   :name "write-json"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_seqs.clj#L82",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/fibs",
   :namespace "clojure.contrib.lazy-seqs",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns a lazy sequence of all the Fibonacci numbers.",
   :name "fibs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_seqs.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/powers-of-2",
   :namespace "clojure.contrib.lazy-seqs",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns a lazy sequence of all the powers of 2",
   :name "powers-of-2"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_seqs.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-seqs-api.html#clojure.contrib.lazy-seqs/primes",
   :namespace "clojure.contrib.lazy-seqs",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/lazy_seqs.clj",
   :var-type "var",
   :doc "Lazy sequence of all the prime numbers.",
   :name "primes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_xml.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-xml-api.html#clojure.contrib.lazy-xml/parse-seq",
   :namespace "clojure.contrib.lazy-xml",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/lazy_xml.clj",
   :var-type "function",
   :arglists ([s] [s startparse] [s startparse queue-size]),
   :doc
   "Parses the source s, which can be a File, InputStream or String\nnaming a URI. Returns a lazy sequence of maps with two or more of\nthe keys :type, :name, :attrs, and :str. Other SAX-compatible\nparsers can be supplied by passing startparse, a fn taking a source\nand a ContentHandler and returning a parser. If a parser is\nspecified, it will be run in a separate thread and be allowed to get\nahead by queue-size items, which defaults to maxint.  If no parser\nis specified and org.xmlpull.v1.XmlPullParser is in the classpath,\nthis superior pull parser will be used.",
   :name "parse-seq"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/lazy_xml.clj#L95",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//lazy-xml-api.html#clojure.contrib.lazy-xml/parse-trim",
   :namespace "clojure.contrib.lazy-xml",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/lazy_xml.clj",
   :var-type "function",
   :arglists ([s] [s startparse queue-size]),
   :doc
   "Parses the source s, which can be a File, InputStream or String\nnaming a URI. Returns a lazy tree of the clojure.xml/element\nstruct-map, which has the keys :tag, :attrs, and :content and\naccessor fns tag, attrs, and content, with the whitespace trimmed\nfrom around each content string. This format is compatible with what\nclojure.xml/parse produces, except :content is a lazy seq instead of\na vector.  Other SAX-compatible parsers can be supplied by passing\nstartparse, a fn taking a source and a ContentHandler and returning\na parser. If a parser is specified, it will be run in a separate\nthread and be allowed to get ahead by queue-size items, which\ndefaults to maxing.  If no parser is specified and\norg.xmlpull.v1.XmlPullParser is in the classpath, this superior pull\nparser will be used.",
   :name "parse-trim"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L202",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*allow-direct-logging*",
   :namespace "clojure.contrib.logging",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "A boolean indicating whether direct logging (as opposed to via an agent) is\nallowed when not operating from within a transaction. Defaults to true.",
   :name "*allow-direct-logging*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L188",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*impl-name*",
   :namespace "clojure.contrib.logging",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc "The name of the logging implementation used.",
   :name "*impl-name*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L196",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/*logging-agent*",
   :namespace "clojure.contrib.logging",
   :line 196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "The default agent used for performing logging durng a transaction or when\ndirect logging is disabled.",
   :name "*logging-agent*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L310",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/debug",
   :namespace "clojure.contrib.logging",
   :line 310,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the debug level.",
   :name "debug"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L226",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/enabled?",
   :namespace "clojure.contrib.logging",
   :line 226,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([level] [level log-ns]),
   :doc
   "Returns true if the specific logging level is enabled.  Use of this function\nshould only be necessary if one needs to execute alternate code paths beyond\nwhether the log should be written to.",
   :name "enabled?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L331",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/error",
   :namespace "clojure.contrib.logging",
   :line 331,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the error level.",
   :name "error"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L338",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/fatal",
   :namespace "clojure.contrib.logging",
   :line 338,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the fatal level.",
   :name "fatal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L188",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-enabled?",
   :namespace "clojure.contrib.logging",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "Implementation-specific check if a particular level is enabled. End-users\nshould not need to call this.",
   :name "impl-enabled?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L188",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-get-log",
   :namespace "clojure.contrib.logging",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "Returns an implementation-specific log by string namespace. End-users should\nnot need to call this.",
   :name "impl-get-log"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L188",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/impl-write!",
   :namespace "clojure.contrib.logging",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "var",
   :doc
   "Implementation-specific write of a log message. End-users should not need to\ncall this.",
   :name "impl-write!"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L317",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/info",
   :namespace "clojure.contrib.logging",
   :line 317,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the info level.",
   :name "info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L208",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log",
   :namespace "clojure.contrib.logging",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists
   ([level message]
    [level message throwable]
    [level message throwable log-ns]),
   :doc
   "Logs a message, either directly or via an agent. Also see the level-specific\nconvenience macros.",
   :name "log"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L265",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-capture!",
   :namespace "clojure.contrib.logging",
   :line 265,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "function",
   :arglists ([log-ns]),
   :doc
   "Captures System.out and System.err, redirecting all writes of those streams\nto :info and :error logging, respectively. The specified log-ns value will\nbe used to namespace all redirected logging. NOTE: this will not redirect\noutput of *out* or *err*; for that, use with-logs.",
   :name "log-capture!"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L243",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-stream",
   :namespace "clojure.contrib.logging",
   :line 243,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "function",
   :arglists ([level log-ns]),
   :doc
   "Creates a PrintStream that will output to the log. End-users should not need\nto invoke this.",
   :name "log-stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L281",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/log-uncapture!",
   :namespace "clojure.contrib.logging",
   :line 281,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Restores System.out and System.err to their original values.",
   :name "log-uncapture!"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L236",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/spy",
   :namespace "clojure.contrib.logging",
   :line 236,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([expr]),
   :doc
   "Evaluates expr and outputs the form and its result to the debug log; returns \nthe result of expr.",
   :name "spy"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L303",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/trace",
   :namespace "clojure.contrib.logging",
   :line 303,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the trace level.",
   :name "trace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L324",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/warn",
   :namespace "clojure.contrib.logging",
   :line 324,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([message] [message throwable]),
   :doc "Logs a message at the warn level.",
   :name "warn"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/logging.clj#L291",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//logging-api.html#clojure.contrib.logging/with-logs",
   :namespace "clojure.contrib.logging",
   :line 291,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/logging.clj",
   :var-type "macro",
   :arglists ([log-ns & body]),
   :doc
   "Evaluates exprs in a context in which *out* and *err* are bound to :info and\n:error logging, respectively. The specified log-ns value will be used to\nnamespace all redirected logging.",
   :name "with-logs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L222",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/defsymbolmacro",
   :namespace "clojure.contrib.macro-utils",
   :line 222,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "macro",
   :arglists ([symbol expansion]),
   :doc
   "Define a symbol macro. Because symbol macros are not part of\nClojure's built-in macro expansion system, they can be used only\ninside a with-symbol-macros form.",
   :name "defsymbolmacro"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L236",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/deftemplate",
   :namespace "clojure.contrib.macro-utils",
   :line 236,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "macro",
   :arglists ([name params & forms]),
   :doc
   "Define a macro that expands into forms after replacing the\nsymbols in params (a vector) by the corresponding parameters\ngiven in the macro call.",
   :name "deftemplate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L201",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/macrolet",
   :namespace "clojure.contrib.macro-utils",
   :line 201,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "macro",
   :arglists ([fn-bindings & exprs]),
   :doc
   "Define local macros that are used in the expansion of exprs. The\nsyntax is the same as for letfn forms.",
   :name "macrolet"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L256",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand",
   :namespace "clojure.contrib.macro-utils",
   :line 256,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "function",
   :arglists ([form]),
   :doc
   "Like clojure.core/macroexpand, but takes into account symbol macros.",
   :name "mexpand"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L248",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand-1",
   :namespace "clojure.contrib.macro-utils",
   :line 248,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "function",
   :arglists ([form]),
   :doc
   "Like clojure.core/macroexpand-1, but takes into account symbol macros.",
   :name "mexpand-1"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L264",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/mexpand-all",
   :namespace "clojure.contrib.macro-utils",
   :line 264,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Perform a full recursive macro expansion of a form.",
   :name "mexpand-all"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L212",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/symbol-macrolet",
   :namespace "clojure.contrib.macro-utils",
   :line 212,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "macro",
   :arglists ([symbol-bindings & exprs]),
   :doc
   "Define local symbol macros that are used in the expansion of exprs.\nThe syntax is the same as for let forms.",
   :name "symbol-macrolet"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macro_utils.clj#L231",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macro-utils-api.html#clojure.contrib.macro-utils/with-symbol-macros",
   :namespace "clojure.contrib.macro-utils",
   :line 231,
   :file "clojure/contrib/macro_utils.clj",
   :var-type "macro",
   :arglists ([& exprs]),
   :doc "Fully expand exprs, including symbol macros.",
   :name "with-symbol-macros"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macros.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/const",
   :namespace "clojure.contrib.macros",
   :line 18,
   :file "clojure/contrib/macros.clj",
   :var-type "macro",
   :arglists ([expr]),
   :doc "Evaluate the constant expression expr at compile time.",
   :name "const"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macros.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/letfn-",
   :namespace "clojure.contrib.macros",
   :line 28,
   :file "clojure/contrib/macros.clj",
   :var-type "macro",
   :arglists ([fn-bindings & exprs]),
   :doc
   "OBSOLETE: use clojure.core/letfn\nA variant of let for local function definitions. fn-bindings consists\nof name/args/body triples, with (letfn [name args body] ...)\nbeing equivalent to (let [name (fn name args body)] ...).",
   :name "letfn-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/macros.clj#L68",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//macros-api.html#clojure.contrib.macros/with-direct-linking",
   :namespace "clojure.contrib.macros",
   :line 68,
   :file "clojure/contrib/macros.clj",
   :var-type "macro",
   :arglists ([symbols? & body]),
   :doc
   "EXPERIMENTAL!\nCompiles the functions in body with direct links to the functions\nnamed in symbols, i.e. without a var lookup for each invocation.\nSymbols is a vector of symbols that name either vars or namespaces.\nA namespace reference is replaced by the list of all symbols in the\nnamespace that are bound to functions. If symbols is not provided,\nthe default value ['clojure.core] is used. The symbol *ns* can be\nused to refer to the current namespace.",
   :name "with-direct-linking"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/map_utils.clj#L41",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/deep-merge-with",
   :namespace "clojure.contrib.map-utils",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/map_utils.clj",
   :var-type "function",
   :arglists ([f & maps]),
   :doc
   "Like merge-with, but merges maps recursively, applying the given fn\nonly when there's a non-map at a particular level.\n\n(deepmerge + {:a {:b {:c 1 :d {:x 1 :y 2}} :e 3} :f 4}\n             {:a {:b {:c 2 :d {:z 9} :z 3} :e 100}})\n-> {:a {:b {:z 3, :c 3, :d {:z 9, :x 1, :y 2}}, :e 103}, :f 4}",
   :name "deep-merge-with"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/map_utils.clj#L22",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/lazy-get",
   :namespace "clojure.contrib.map-utils",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/map_utils.clj",
   :var-type "macro",
   :arglists ([map key not-found]),
   :doc
   "Like get, but doesn't evaluate not-found unless it is needed.",
   :name "lazy-get"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/map_utils.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/safe-get",
   :namespace "clojure.contrib.map-utils",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/map_utils.clj",
   :var-type "function",
   :arglists ([map key]),
   :doc "Like get, but throws an exception if the key is not found.",
   :name "safe-get"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/map_utils.clj#L35",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//map-utils-api.html#clojure.contrib.map-utils/safe-get-in",
   :namespace "clojure.contrib.map-utils",
   :line 35,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/map_utils.clj",
   :var-type "function",
   :arglists ([map ks]),
   :doc
   "Like get-in, but throws an exception if any key is not found.",
   :name "safe-get-in"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L122",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/abs",
   :namespace "clojure.contrib.math",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "(abs n) is the absolute value of n",
   :name "abs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L141",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/ceil",
   :namespace "clojure.contrib.math",
   :line 141,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "multimethod",
   :arglists ([n]),
   :doc
   "(ceil n) returns the least integer greater than or equal to n.\nIf n is an exact number, ceil returns an integer, otherwise a double.",
   :name "ceil"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L206",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/exact-integer-sqrt",
   :namespace "clojure.contrib.math",
   :line 206,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "function",
   :arglists ([n]),
   :doc
   "(exact-integer-sqrt n) expects a non-negative integer n, and returns [s r] where n = s^2+r and n < (s+1)^2.  In other words, it returns the floor of the square root and the 'remainder'.\nFor example, (exact-integer-sqrt 15) is [3 6] because 15 = 3^2+6.",
   :name "exact-integer-sqrt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L101",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/expt",
   :namespace "clojure.contrib.math",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "multimethod",
   :arglists ([base pow]),
   :doc
   "(expt base pow) is base to the pow power.\nReturns an exact number if the base is an exact number and the power is an integer, otherwise returns a double.",
   :name "expt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L129",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/floor",
   :namespace "clojure.contrib.math",
   :line 129,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "multimethod",
   :arglists ([n]),
   :doc
   "(floor n) returns the greatest integer less than or equal to n.\nIf n is an exact number, floor returns an integer, otherwise a double.",
   :name "floor"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L162",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/gcd",
   :namespace "clojure.contrib.math",
   :line 162,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc "(gcd a b) returns the greatest common divisor of a and b",
   :name "gcd"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L169",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/lcm",
   :namespace "clojure.contrib.math",
   :line 169,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc "(lcm a b) returns the least common multiple of a and b",
   :name "lcm"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L153",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/round",
   :namespace "clojure.contrib.math",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "multimethod",
   :arglists ([n]),
   :doc
   "(round n) rounds to the nearest integer.\nround always returns an integer.  Rounds up for values exactly in between two integers.",
   :name "round"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/math.clj#L215",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//math-api.html#clojure.contrib.math/sqrt",
   :namespace "clojure.contrib.math",
   :line 215,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/math.clj",
   :var-type "multimethod",
   :arglists ([n]),
   :doc "Square root, but returns exact number if possible.",
   :name "sqrt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout.clj#L75",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout/components",
   :namespace "clojure.contrib.miglayout",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout.clj",
   :var-type "function",
   :arglists ([container]),
   :doc
   "Returns a map from id (a keyword) to component for all components with\nan id constraint set",
   :name "components"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout.clj#L37",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout/miglayout",
   :namespace "clojure.contrib.miglayout",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout.clj",
   :var-type "function",
   :arglists ([container & args]),
   :doc
   "Adds java.awt.Components to a javax.swing.JComponent with constraints\nformatted for the MiGLayout layout manager.\n\nArguments: container [item constraint*]*\n\n  - container: the container for the specified components, its layout\n    manager will be set to a new instance of MigLayout\n\n  - an inline series of items and constraints--each item may be followed\n    by zero or more constraints.\n\nItem:\n\n  - An item is either a Component or one of the keywords :layout\n   :column or :row. Constraints for a keyword item affect the entire\n    layout.\n\nConstraint: string, keyword, vector, map, or set\n\n  - A string specifies one or more constraints each with zero or more\n    arguments.\n  - A keyword specifies a single constraint without arguments\n  - A vector specifies a single constraint with one or more arguments\n  - A map specifies one or more constraints as keys, each mapped to a\n    single argument\n  - A set groups two or more constraints, each a string, keyword,\n    vector, map, or set\n\nAny items marked with an \"id\" constraint will be included in a map from\nid to component attached to the container. The map can be retrieved using\nclojure.contrib.miglayout/components.",
   :name "miglayout"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mmap.clj#L39",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/buffer-stream",
   :namespace "clojure.contrib.mmap",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/mmap.clj",
   :var-type "function",
   :arglists ([buf]),
   :doc
   "Returns an InputStream for a ByteBuffer, such as returned by mmap.",
   :name "buffer-stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mmap.clj#L27",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/mmap",
   :namespace "clojure.contrib.mmap",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/mmap.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "Memory-map the file named f.  Returns a ByteBuffer.",
   :name "mmap"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mmap.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mmap-api.html#clojure.contrib.mmap/slurp",
   :namespace "clojure.contrib.mmap",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/mmap.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "Reads the file named by f and returns it as a string.",
   :name "slurp"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L216",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/calls",
   :namespace "clojure.contrib.mock",
   :line 216,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([val] [val expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :calls key with a\nfunction that will be called with the given arguments. The return value from\nthis function will be returned returned by the expected function. If both this\nand returns are specified, the return value of \"calls\" will have precedence.\nUsage:\n(calls some-fn expectation-hash?)",
   :name "calls"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L265",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/expect",
   :namespace "clojure.contrib.mock",
   :line 265,
   :file "clojure/contrib/mock.clj",
   :var-type "macro",
   :arglists ([expect-bindings & body]),
   :doc
   "Use expect to redirect calls to dependent functions that are made within the\ncode under test. Instead of calling the functions that would normally be used,\ntemporary stubs are used, which can verify function parameters and call counts.\nReturn values can also be specified as needed.\nUsage:\n(expect [dep-fn (has-args [arg-pred1] (times n (returns x)))]\n  (function-under-test a b c))",
   :name "expect"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/has-args",
   :namespace "clojure.contrib.mock",
   :line 228,
   :file "clojure/contrib/mock.clj",
   :var-type "macro",
   :arglists ([arg-pred-forms] [arg-pred-forms expect-hash-form]),
   :doc
   "Creates or associates to an existing expectation hash the :has-args key with\na value corresponding to a function that will either return true if its\nargument expectations are met or throw an exception with the details of the\nfirst failed argument it encounters.\nOnly specify as many predicates as you are interested in verifying. The rest\nof the values are safely ignored.\nUsage:\n(has-args [arg-pred-1 arg-pred-2 ... arg-pred-n] expectation-hash?)",
   :name "has-args"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L105",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/has-matching-signature?",
   :namespace "clojure.contrib.mock",
   :line 105,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([fn-name args]),
   :doc
   "Calls no-matching-function-signature if no match is found for the given\nfunction. If no argslist meta data is available for the function, it is\nnot called.",
   :name "has-matching-signature?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-arg-checker",
   :namespace "clojure.contrib.mock",
   :line 116,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([arg-preds arg-pred-forms]),
   :doc
   "Creates the argument verifying function for a replaced dependency within\nthe expectation bound scope. These functions take the additional argument\nof the name of the replaced function, then the rest of their args. It is\ndesigned to be called from the mock function generated in the first argument\nof the mock info object created by make-mock.",
   :name "make-arg-checker"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L131",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-count-checker",
   :namespace "clojure.contrib.mock",
   :line 131,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([pred pred-form]),
   :doc
   "creates the count checker that is invoked at the end of an expectation, after\nthe code under test has all been executed. The function returned takes the\nname of the associated dependency and the invocation count as arguments.",
   :name "make-count-checker"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L150",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/make-mock",
   :namespace "clojure.contrib.mock",
   :line 150,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([fn-name expectation-hash]),
   :doc
   "creates a vector containing the following information for the named function:\n1. dependent function replacement - verifies signature, calls arg checker,\nincreases count, returns return value.\n2. an atom containing the invocation count\n3. the invocation count checker function\n4. a symbol of the name of the function being replaced.",
   :name "make-mock"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L205",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/returns",
   :namespace "clojure.contrib.mock",
   :line 205,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([val] [val expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :returns key with\na value to be returned by the expectation after a successful invocation\nmatching its expected arguments (if applicable).\nUsage:\n(returns ret-value expectation-hash?)",
   :name "returns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/times",
   :namespace "clojure.contrib.mock",
   :line 246,
   :file "clojure/contrib/mock.clj",
   :var-type "macro",
   :arglists ([times-fn] [times-fn expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :times key with a\nvalue corresponding to a predicate function which expects an integer value.\nThis function can either be specified as the first argument to times or can be\nthe result of calling times with an integer argument, in which case the\npredicate will default to being an exact match.  This predicate is called at\nthe end of an expect expression to validate that an expected dependency\nfunction was called the expected number of times.\nUsage:\n(times n)\n(times #(> n %))\n(times n expectation-hash)",
   :name "times"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L175",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock/validate-counts",
   :namespace "clojure.contrib.mock",
   :line 175,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([mock-data]),
   :doc
   "given the sequence of all mock data for the expectation, simply calls the\ncount checker for each dependency.",
   :name "validate-counts"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/flush",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Flush",
   :name "flush"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L67",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/print",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 67,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([obj]),
   :doc "Print obj",
   :name "print"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L72",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/println",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([] [obj]),
   :doc "Print obj followed by a newline",
   :name "println"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-char",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Read a single character",
   :name "read-char"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-line",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Read a single line",
   :name "read-line"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L126",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/read-lines",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 126,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Read all lines and return them in a vector",
   :name "read-lines"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L52",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/skip-chars",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "Skip n characters",
   :name "skip-chars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L98",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-io-streams",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([io-specs statement]),
   :doc
   "Open one or more streams as specified by io-spec, run a monadic\nI/O statement on them, and close the streams. io-spec is\na binding-like vector in which each stream is specified by\nthree element: a keyword by which the stream can be referred to,\nthe stream mode (:read or :write), and a stream specification as\naccepted by clojure.contrib.io/reader (mode :read) or\nclojure.contrib.io/writer (mode :write). The statement\nis run on a state which is a map from keywords to corresponding\nstreams. Single-stream monadic I/O statements must be wrapped\nwith clojure.contrib.monads/with-state-field.",
   :name "with-io-streams"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L82",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-reader",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([reader-spec statement]),
   :doc
   "Create a reader from reader-spec, run the monadic I/O statement\non it, and close the reader. reader-spec can be any object accepted\nby clojure.contrib.io/reader.",
   :name "with-reader"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/with-writer",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([writer-spec statement]),
   :doc
   "Create a writer from writer-spec, run the monadic I/O statement\non it, and close the writer. writer-spec can be any object accepted\nby clojure.contrib.io/writer.",
   :name "with-writer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/a762fda63e8f4f0257bb7d27f5886bd1e75e3054/src/main/clojure/clojure/contrib/monadic_io_streams.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monadic-io-streams-api.html#clojure.contrib.monadic-io-streams/write",
   :namespace "clojure.contrib.monadic-io-streams",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monadic_io_streams.clj",
   :var-type "function",
   :arglists ([text]),
   :doc "Write text (a string)",
   :name "write"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L456",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/call-cc",
   :namespace "clojure.contrib.monads",
   :line 456,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "A computation in the cont monad that calls function f with a single\nargument representing the current continuation. The function f should\nreturn a continuation (which becomes the return value of call-cc),\nor call the passed-in current continuation to terminate.",
   :name "call-cc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L440",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/cont-m",
   :namespace "clojure.contrib.monads",
   :line 440,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing computations in continuation-passing style. The monadic\nvalues are functions that are called with a single argument representing\nthe continuation of the computation, to which they pass their result.",
   :name "cont-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/defmonad",
   :namespace "clojure.contrib.monads",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([name doc-string operations] [name operations]),
   :doc
   "Define a named monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :name "defmonad"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L137",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/defmonadfn",
   :namespace "clojure.contrib.monads",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists
   ([name docstring? attr-map? args expr]
    [name docstring? attr-map? (args expr) ...]),
   :doc
   "Like defn, but for functions that use monad operations and are used inside\na with-monad block.",
   :name "defmonadfn"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L114",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/domonad",
   :namespace "clojure.contrib.monads",
   :line 114,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([steps expr] [name steps expr]),
   :doc
   "Monad comprehension. Takes the name of a monad, a vector of steps\ngiven as binding-form/monadic-expression pairs, and a result value\nspecified by expr. The monadic-expression terms can use the binding\nvariables of the previous steps.\nIf the monad contains a definition of m-zero, the step list can also\ncontain conditions of the form :when p, where the predicate p can\ncontain the binding variables from all previous steps.\nA clause of the form :let [binding-form expr ...], where the bindings\nare given as a vector as for the use in let, establishes additional\nbindings that can be used in the following steps.",
   :name "domonad"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L359",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/fetch-state",
   :namespace "clojure.contrib.monads",
   :line 359,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Return a state-monad function that returns the current state and does not\nmodify it.",
   :name "fetch-state"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L365",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/fetch-val",
   :namespace "clojure.contrib.monads",
   :line 365,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([key]),
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreturns the value corresponding to the given key. The state is not modified.",
   :name "fetch-val"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L286",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/identity-m",
   :namespace "clojure.contrib.monads",
   :line 286,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing plain computations. This monad does in fact nothing\nat all. It is useful for testing, for combination with monad\ntransformers, and for code that is parameterized with a monad.",
   :name "identity-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L217",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-chain",
   :namespace "clojure.contrib.monads",
   :line 217,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Chains together monadic computation steps that are each functions\nof one parameter. Each step is called with the result of the previous\nstep as its argument. (m-chain (step1 step2)) is equivalent to\n(fn [x] (domonad [r1 (step1 x) r2 (step2 r1)] r2)).",
   :name "m-chain"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L195",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-fmap",
   :namespace "clojure.contrib.monads",
   :line 195,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Bind the monadic value m to the function returning (f x) for argument x",
   :name "m-fmap"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L189",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-join",
   :namespace "clojure.contrib.monads",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Converts a monadic value containing a monadic value into a 'simple'\nmonadic value.",
   :name "m-join"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L180",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-lift",
   :namespace "clojure.contrib.monads",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([n f]),
   :doc
   "Converts a function f of n arguments into a function of n\nmonadic arguments returning a monadic value.",
   :name "m-lift"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L211",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-map",
   :namespace "clojure.contrib.monads",
   :line 211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "'Executes' the sequence of monadic values resulting from mapping\nf onto the values xs. f must return a monadic value.",
   :name "m-map"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-reduce",
   :namespace "clojure.contrib.monads",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Return the reduction of (m-lift 2 f) over the list of monadic values mvs\nwith initial value (m-result val).",
   :name "m-reduce"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L200",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-seq",
   :namespace "clojure.contrib.monads",
   :line 200,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "'Executes' the monadic values in ms and returns a sequence of the\nbasic values contained in them.",
   :name "m-seq"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L241",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-until",
   :namespace "clojure.contrib.monads",
   :line 241,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "While (p x) is false, replace x by the value returned by the\nmonadic computation (f x). Return (m-result x) for the first\nx for which (p x) is true.",
   :name "m-until"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L253",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-when",
   :namespace "clojure.contrib.monads",
   :line 253,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([test m-expr]),
   :doc
   "If test is logical true, return monadic value m-expr, else return\n(m-result nil).",
   :name "m-when"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L259",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/m-when-not",
   :namespace "clojure.contrib.monads",
   :line 259,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([test m-expr]),
   :doc
   "If test if logical false, return monadic value m-expr, else return\n(m-result nil).",
   :name "m-when-not"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L296",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/maybe-m",
   :namespace "clojure.contrib.monads",
   :line 296,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing computations with possible failures. Failure is\nrepresented by nil, any other value is considered valid. As soon as\na step returns nil, the whole computation will yield nil as well.",
   :name "maybe-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L496",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/maybe-t",
   :namespace "clojure.contrib.monads",
   :line 496,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([m] [m nothing] [m nothing which-m-plus]),
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values can be invalid (represented by nothing, which defaults\nto nil). The third argument chooses if m-zero and m-plus are inherited\nfrom the base monad (use :m-plus-from-base) or adopt maybe-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :name "maybe-t"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L36",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/monad",
   :namespace "clojure.contrib.monads",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([operations]),
   :doc
   "Define a monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :name "monad"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L474",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/monad-transformer",
   :namespace "clojure.contrib.monads",
   :line 474,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([base which-m-plus operations]),
   :doc
   "Define a monad transforer in terms of the monad operations and the base\nmonad. The argument which-m-plus chooses if m-zero and m-plus are taken\nfrom the base monad or from the transformer.",
   :name "monad-transformer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L451",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/run-cont",
   :namespace "clojure.contrib.monads",
   :line 451,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([c]),
   :doc
   "Execute the computation c in the cont monad and return its result.",
   :name "run-cont"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L309",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/sequence-m",
   :namespace "clojure.contrib.monads",
   :line 309,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, i.e. computations\nthat can yield multiple values. Any object implementing the seq\nprotocol can be used as a monadic value.",
   :name "sequence-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L528",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/sequence-t",
   :namespace "clojure.contrib.monads",
   :line 528,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([m] [m which-m-plus]),
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values are sequences. The argument which-m-plus chooses\nif m-zero and m-plus are inherited from the base monad\n(use :m-plus-from-base) or adopt sequence-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :name "sequence-t"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L323",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-m",
   :namespace "clojure.contrib.monads",
   :line 323,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, like sequence-m,\nbut returning sets of results instead of sequences of results.",
   :name "set-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L353",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-state",
   :namespace "clojure.contrib.monads",
   :line 353,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Return a state-monad function that replaces the current state by s and\nreturns the previous state.",
   :name "set-state"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L383",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/set-val",
   :namespace "clojure.contrib.monads",
   :line 383,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([key val]),
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with key by val. The old value is returned.",
   :name "set-val"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L336",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-m",
   :namespace "clojure.contrib.monads",
   :line 336,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "var",
   :doc
   "Monad describing stateful computations. The monadic values have the\nstructure (fn [old-state] [result new-state]).",
   :name "state-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L401",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-m-until",
   :namespace "clojure.contrib.monads",
   :line 401,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([p f x]),
   :doc
   "An optimized implementation of m-until for the state monad that\nreplaces recursion by a loop.",
   :name "state-m-until"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L555",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/state-t",
   :namespace "clojure.contrib.monads",
   :line 555,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "Monad transformer that transforms a monad m into a monad of stateful\ncomputations that have the base monad type as their result.",
   :name "state-t"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L347",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/update-state",
   :namespace "clojure.contrib.monads",
   :line 347,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "Return a state-monad function that replaces the current state by the\nresult of f applied to the current state and that returns the old state.",
   :name "update-state"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L373",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/update-val",
   :namespace "clojure.contrib.monads",
   :line 373,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([key f]),
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with the given key by the return value\nof f applied to the old value. The old value is returned.",
   :name "update-val"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L102",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/with-monad",
   :namespace "clojure.contrib.monads",
   :line 102,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "macro",
   :arglists ([monad & exprs]),
   :doc
   "Evaluates an expression after replacing the keywords defining the\nmonad operations by the functions associated with these keywords\nin the monad definition given by name.",
   :name "with-monad"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L389",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/with-state-field",
   :namespace "clojure.contrib.monads",
   :line 389,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([key statement]),
   :doc
   "Returns a state-monad function that expects a map as its state and\nruns statement (another state-monad function) on the state defined by\nthe map entry corresponding to key. The map entry is updated with the\nnew state returned by statement.",
   :name "with-state-field"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/monads.clj#L413",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//monads-api.html#clojure.contrib.monads/writer-m",
   :namespace "clojure.contrib.monads",
   :line 413,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/monads.clj",
   :var-type "function",
   :arglists ([empty-accumulator]),
   :doc
   "Monad describing computations that accumulate data on the side, e.g. for\nlogging. The monadic values have the structure [value log]. Any of the\naccumulators from clojure.contrib.accumulators can be used for storing the\nlog data. Its empty value is passed as a parameter.",
   :name "writer-m"}
  {:arglists ([nsname]),
   :name "dir",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L77",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/dir",
   :doc "Prints a sorted directory of public vars in a namespace",
   :var-type "macro",
   :line 77,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L83",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/docs",
   :namespace "clojure.contrib.ns-utils",
   :line 83,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "macro",
   :arglists ([nsname]),
   :doc "Prints documentation for the public vars in a namespace",
   :name "docs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/get-ns",
   :namespace "clojure.contrib.ns-utils",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "function",
   :arglists ([ns-sym]),
   :doc
   "Returns the namespace named by ns-sym or throws if the\nnamespace does not exist",
   :name "get-ns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/immigrate",
   :namespace "clojure.contrib.ns-utils",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "function",
   :arglists ([& ns-names]),
   :doc
   "Create a public var in this namespace for each public var in the\nnamespaces named by ns-names. The created vars have the same name, root\nbinding, and metadata as the original except that their :ns metadata\nvalue is this namespace.",
   :name "immigrate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L50",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/ns-vars",
   :namespace "clojure.contrib.ns-utils",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "function",
   :arglists ([ns]),
   :doc
   "Returns a sorted seq of symbols naming public vars in\na namespace",
   :name "ns-vars"}
  {:arglists ([ns]),
   :name "print-dir",
   :namespace "clojure.contrib.ns-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L56",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/print-dir",
   :doc "Prints a sorted directory of public vars in a namespace",
   :var-type "function",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/print-docs",
   :namespace "clojure.contrib.ns-utils",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "function",
   :arglists ([ns]),
   :doc "Prints documentation for the public vars in a namespace",
   :name "print-docs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/df1b195197e8fe0c64a14335a5ae9854e75feff8/src/main/clojure/clojure/contrib/ns_utils.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//ns-utils-api.html#clojure.contrib.ns-utils/vars",
   :namespace "clojure.contrib.ns-utils",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/ns_utils.clj",
   :var-type "macro",
   :arglists ([nsname]),
   :doc
   "Returns a sorted seq of symbols naming public vars in\na namespace",
   :name "vars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/dispatch.clj#L354",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*code-dispatch*",
   :namespace "clojure.contrib.pprint",
   :line 354,
   :file "clojure/contrib/pprint/dispatch.clj",
   :var-type "multimethod",
   :arglists [[object]],
   :doc
   "The pretty print dispatch function for pretty printing Clojure code.",
   :name "*code-dispatch*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L78",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-base*",
   :namespace "clojure.contrib.pprint",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc "The base to use for printing integers and rationals.",
   :name "*print-base*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-circle*",
   :namespace "clojure.contrib.pprint",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc "Mark circular structures (N.B. This is not yet used)",
   :name "*print-circle*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-lines*",
   :namespace "clojure.contrib.pprint",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "Maximum number of lines to print in a pretty print instance (N.B. This is not yet used)",
   :name "*print-lines*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L44",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-miser-width*",
   :namespace "clojure.contrib.pprint",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "The column at which to enter miser style. Depending on the dispatch table, \nmiser style add newlines in more places to try to keep lines short allowing for further \nlevels of nesting.",
   :name "*print-miser-width*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-pprint-dispatch*",
   :namespace "clojure.contrib.pprint",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "The pretty print dispatch function. Use with-pprint-dispatch or set-pprint-dispatch\nto modify.",
   :name "*print-pprint-dispatch*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-pretty*",
   :namespace "clojure.contrib.pprint",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc "Bind to true if you want write to use pretty printing",
   :name "*print-pretty*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L72",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-radix*",
   :namespace "clojure.contrib.pprint",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8, \nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the \nradix specifier is in the form #XXr where XX is the decimal value of *print-base* ",
   :name "*print-radix*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-right-margin*",
   :namespace "clojure.contrib.pprint",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all \nnon-mandatory newlines.",
   :name "*print-right-margin*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L61",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-shared*",
   :namespace "clojure.contrib.pprint",
   :line 61,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "Mark repeated structures rather than repeat them (N.B. This is not yet used)",
   :name "*print-shared*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L65",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*print-suppress-namespaces*",
   :namespace "clojure.contrib.pprint",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "var",
   :doc
   "Don't print namespaces with symbols. This is particularly useful when \npretty printing the results of macro expansions",
   :name "*print-suppress-namespaces*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/dispatch.clj#L125",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/*simple-dispatch*",
   :namespace "clojure.contrib.pprint",
   :line 125,
   :file "clojure/contrib/pprint/dispatch.clj",
   :var-type "multimethod",
   :arglists [[object]],
   :doc
   "The pretty print dispatch function for simple data structure format.",
   :name "*simple-dispatch*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/cl_format.clj#L26",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/cl-format",
   :namespace "clojure.contrib.pprint",
   :line 26,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/cl_format.clj",
   :var-type "function",
   :arglists ([writer format-in & args]),
   :doc
   "An implementation of a Common Lisp compatible format function. cl-format formats its\narguments to an output stream or string based on the format control string given. It \nsupports sophisticated formatting of structured data.\n\nWriter is an instance of java.io.Writer, true to output to *out* or nil to output \nto a string, format-in is the format control string and the remaining arguments \nare the data to be formatted.\n\nThe format control string is a string to be output with embedded 'format directives' \ndescribing how to format the various arguments passed in.\n\nIf writer is nil, cl-format returns the formatted result string. Otherwise, cl-format \nreturns nil.\n\nFor example:\n (let [results [46 38 22]]\n        (cl-format true \"There ~[are~;is~:;are~]~:* ~d result~:p: ~{~d~^, ~}~%\" \n                   (count results) results))\n\nPrints to *out*:\n There are 3 results: 46, 38, 22\n\nDetailed documentation on format control strings is available in the \"Common Lisp the \nLanguage, 2nd edition\", Chapter 22 (available online at:\nhttp://www.cs.cmu.edu/afs/cs.cmu.edu/project/ai-repository/ai/html/cltl/clm/node200.html#SECTION002633000000000000000) \nand in the Common Lisp HyperSpec at \nhttp://www.lispworks.com/documentation/HyperSpec/Body/22_c.htm",
   :name "cl-format"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/cl_format.clj#L1749",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/compile-format",
   :namespace "clojure.contrib.pprint",
   :line 1749,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/cl_format.clj",
   :var-type "function",
   :arglists ([format-str]),
   :doc
   "Compiles format-str into a compiled format which can be used as an argument\nto cl-format just like a plain format string. Use this function for improved \nperformance when you're using the same format string repeatedly",
   :name "compile-format"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/cl_format.clj#L1817",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/formatter",
   :namespace "clojure.contrib.pprint",
   :line 1817,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/cl_format.clj",
   :var-type "macro",
   :arglists ([format-in]),
   :doc
   "Makes a function which can directly run format-in. The function is\nfn [stream & args] ... and returns nil unless the stream is nil (meaning \noutput to a string) in which case it returns the resulting string.\n\nformat-in can be either a control string or a previously compiled format.",
   :name "formatter"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/cl_format.clj#L1831",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/formatter-out",
   :namespace "clojure.contrib.pprint",
   :line 1831,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/cl_format.clj",
   :var-type "macro",
   :arglists ([format-in]),
   :doc
   "Makes a function which can directly run format-in. The function is\nfn [& args] ... and returns nil. This version of the formatter macro is\ndesigned to be used with *out* set to an appropriate Writer. In particular,\nthis is meant to be used as part of a pretty printer dispatch method.\n\nformat-in can be either a control string or a previously compiled format.",
   :name "formatter-out"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/cl_format.clj#L1153",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/fresh-line",
   :namespace "clojure.contrib.pprint",
   :line 1153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/cl_format.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Make a newline if the Writer is not already at the beginning of the line.\nN.B. Only works on ColumnWriters right now.",
   :name "fresh-line"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L241",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pp",
   :namespace "clojure.contrib.pprint",
   :line 241,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "macro",
   :arglists ([]),
   :doc
   "A convenience macro that pretty prints the last thing output. This is\nexactly equivalent to (pprint *1).",
   :name "pp"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L229",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pprint",
   :namespace "clojure.contrib.pprint",
   :line 229,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([object] [object writer]),
   :doc
   "Pretty print object to the optional output writer. If the writer is not provided, \nprint the object to the currently bound value of *out*.",
   :name "pprint"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L315",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pprint-indent",
   :namespace "clojure.contrib.pprint",
   :line 315,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([relative-to n]),
   :doc
   "Create an indent at this point in the pretty printing stream. This defines how \nfollowing lines are indented. relative-to can be either :block or :current depending \nwhether the indent should be computed relative to the start of the logical block or\nthe current column position. n is an offset. \n\nOutput is sent to *out* which must be a pretty printing writer.",
   :name "pprint-indent"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L286",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pprint-logical-block",
   :namespace "clojure.contrib.pprint",
   :line 286,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "macro",
   :arglists [[options* body]],
   :doc
   "Execute the body as a pretty printing logical block with output to *out* which \nmust be a pretty printing writer. When used from pprint or cl-format, this can be \nassumed. \n\nBefore the body, the caller can optionally specify options: :prefix, :per-line-prefix, \nand :suffix.",
   :name "pprint-logical-block"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L306",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pprint-newline",
   :namespace "clojure.contrib.pprint",
   :line 306,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([kind]),
   :doc
   "Print a conditional newline to a pretty printing stream. kind specifies if the \nnewline is :linear, :miser, :fill, or :mandatory. \n\nOutput is sent to *out* which must be a pretty printing writer.",
   :name "pprint-newline"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L327",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/pprint-tab",
   :namespace "clojure.contrib.pprint",
   :line 327,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([kind colnum colinc]),
   :doc
   "Tab at this point in the pretty printing stream. kind specifies whether the tab\nis :line, :section, :line-relative, or :section-relative. \n\nColnum and colinc specify the target column and the increment to move the target\nforward if the output is already past the original target.\n\nOutput is sent to *out* which must be a pretty printing writer.\n\nTHIS FUNCTION IS NOT YET IMPLEMENTED.",
   :name "pprint-tab"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/set-pprint-dispatch",
   :namespace "clojure.contrib.pprint",
   :line 246,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([function]),
   :doc
   "Set the pretty print dispatch function to a function matching (fn [obj] ...)\nwhere obj is the object to pretty print. That function will be called with *out* set\nto a pretty printing writer to which it should do its printing.\n\nFor example functions, see *simple-dispatch* and *code-dispatch* in \nclojure.contrib.pprint.dispatch.clj.",
   :name "set-pprint-dispatch"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/dispatch.clj#L19",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/use-method",
   :namespace "clojure.contrib.pprint",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/dispatch.clj",
   :var-type "function",
   :arglists ([multifn dispatch-val func]),
   :doc
   "Installs a function as a new method of multimethod associated with dispatch-value. ",
   :name "use-method"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L259",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/with-pprint-dispatch",
   :namespace "clojure.contrib.pprint",
   :line 259,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "macro",
   :arglists ([function & body]),
   :doc
   "Execute body with the pretty print dispatch function bound to function.",
   :name "with-pprint-dispatch"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L186",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/write",
   :namespace "clojure.contrib.pprint",
   :line 186,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([object & kw-args]),
   :doc
   "Write an object subject to the current bindings of the printer control variables.\nUse the kw-args argument to override individual variables for this call (and any \nrecursive calls). Returns the string result if :stream is nil or nil otherwise.\n\nThe following keyword arguments can be passed with values:\n  Keyword              Meaning                              Default value\n  :stream              Writer for output or nil             true (indicates *out*)\n  :base                Base to use for writing rationals    Current value of *print-base*\n  :circle*             If true, mark circular structures    Current value of *print-circle*\n  :length              Maximum elements to show in sublists Current value of *print-length*\n  :level               Maximum depth                        Current value of *print-level*\n  :lines*              Maximum lines of output              Current value of *print-lines*\n  :miser-width         Width to enter miser mode            Current value of *print-miser-width*\n  :dispatch            The pretty print dispatch function   Current value of *print-pprint-dispatch*\n  :pretty              If true, do pretty printing          Current value of *print-pretty*\n  :radix               If true, prepend a radix specifier   Current value of *print-radix*\n  :readably*           If true, print readably              Current value of *print-readably*\n  :right-margin        The column for the right margin      Current value of *print-right-margin*\n  :suppress-namespaces If true, no namespaces in symbols    Current value of *print-suppress-namespaces*\n\n  * = not yet supported",
   :name "write"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/pprint/pprint_base.clj#L161",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//pprint-api.html#clojure.contrib.pprint/write-out",
   :namespace "clojure.contrib.pprint",
   :line 161,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/pprint/pprint_base.clj",
   :var-type "function",
   :arglists ([object]),
   :doc
   "Write an object to *out* subject to the current bindings of the printer control \nvariables. Use the kw-args argument to override individual variables for this call (and \nany recursive calls).\n\n*out* must be a PrettyWriter if pretty printing is enabled. This is the responsibility\nof the caller.\n\nThis method is primarily intended for use by pretty print dispatch functions that \nalready know that the pretty printer will have set up their environment appropriately.\nNormal library clients should use the standard \"write\" interface. ",
   :name "write-out"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L146",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/certainly",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([v]),
   :doc
   "Returns a distribution in which the single value v has probability 1.",
   :name "certainly"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L92",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/choose",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 92,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([& choices]),
   :doc
   "Construct a distribution from an explicit list of probabilities\nand values. They are given in the form of a vector of probability-value\npairs. In the last pair, the probability can be given by the keyword\n:else, which stands for 1 minus the total of the other probabilities.",
   :name "choose"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/cond-dist-m",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "var",
   :doc "Variant of the dist monad that can handle undefined values.",
   :name "cond-dist-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L160",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/cond-prob",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([pred dist]),
   :doc
   "Returns the conditional probability for the values in dist that satisfy\nthe predicate pred.",
   :name "cond-prob"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/dist-m",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "var",
   :doc
   "Monad describing computations on fuzzy quantities, represented by a finite\nprobability distribution for the possible values. A distribution is\nrepresented by a map from values to probabilities.",
   :name "dist-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L151",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/join-with",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([f dist1 dist2]),
   :doc
   "Returns the distribution of (f x y) with x from dist1 and y from dist2.",
   :name "join-with"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L134",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/make-distribution",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 134,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([coll f]),
   :doc
   "Returns the distribution in which each element x of the collection\nhas a probability proportional to (f x)",
   :name "make-distribution"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L70",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/normalize",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 70,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([weights]),
   :doc
   "Convert a weight map (e.g. a map of counter values) to a distribution\nby multiplying with a normalization factor. If the map has a key\n:total, its value is assumed to be the sum over all the other values and\nit is used for normalization. Otherwise, the sum is calculated\nexplicitly. The :total key is removed from the resulting distribution.",
   :name "normalize"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L197",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/prob",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 197,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([pred dist]),
   :doc
   "Return the probability that the predicate pred is satisfied in the\ndistribution dist, i.e. the sum of the probabilities of the values\nthat satisfy pred.",
   :name "prob"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L84",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/uniform",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 84,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([coll]),
   :doc
   "Return a distribution in which each of the elements of coll\nhas the same probability.",
   :name "uniform"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj#L140",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.finite-distributions-api.html#clojure.contrib.probabilities.finite-distributions/zipf",
   :namespace "clojure.contrib.probabilities.finite-distributions",
   :line 140,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/finite_distributions.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc
   "Returns the Zipf distribution in which the numbers k=1..n have\nprobabilities proportional to 1/k^s.",
   :name "zipf"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/discrete",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([dist]),
   :doc
   "A discrete distribution, defined by a map dist mapping values\nto probabilities. The sum of probabilities must be one.",
   :name "discrete"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L146",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/exponential",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([lambda]),
   :doc
   "Transform a sequence of uniform random numbers in the interval [0, 1)\ninto a sequence of exponential random numbers with parameter lambda.",
   :name "exponential"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L137",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/lognormal",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([mu sigma]),
   :doc
   "Transform a sequence of uniform random numbesr in the interval [0, 1)\ninto a sequence of lognormal random numbers with mean mu and standard\ndeviation sigma.",
   :name "lognormal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/n-sphere",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([n r]),
   :doc
   "Return a uniform distribution of n-dimensional vectors inside an\nn-sphere of radius r.",
   :name "n-sphere"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/normal",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 116,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([mu sigma]),
   :doc
   "Transform a sequence urs of uniform random number in the interval [0, 1)\ninto a sequence of normal random numbers with mean mu and standard\ndeviation sigma.",
   :name "normal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L163",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/normal-box-muller",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 163,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([mu sigma]),
   :doc
   "Transform a sequence of uniform random numbers in the interval [0, 1)\ninto a sequence of normal random numbers with mean mu and standard\ndeviation sigma.",
   :name "normal-box-muller"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/random-stream",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([distribution random-stream-state]),
   :doc
   "Define a random stream by a distribution and the state of a\nrandom number stream with uniform distribution in [0, 1).",
   :name "random-stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L74",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/reject",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 74,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([p dist]),
   :doc
   "Return the distribution that results from rejecting the values from\ndist that do not satisfy predicate p.",
   :name "reject"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([n dist]),
   :doc
   "Return the distribution of samples of length n from the\ndistribution dist",
   :name "sample"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-mean",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([n dist]),
   :doc
   "Return the distribution of the mean over n samples from the\ndistribution dist",
   :name "sample-mean"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-mean-variance",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([n dist]),
   :doc
   "Return the distribution of the mean-and-variance (a vector containing\nthe mean and the variance) over n samples from the distribution dist",
   :name "sample-mean-variance"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-reduce",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([f n dist] [f val n dist]),
   :doc
   "Returns the distribution of the reduction of f over n samples from the\ndistribution dist.",
   :name "sample-reduce"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.monte-carlo-api.html#clojure.contrib.probabilities.monte-carlo/sample-sum",
   :namespace "clojure.contrib.probabilities.monte-carlo",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/monte_carlo.clj",
   :var-type "function",
   :arglists ([n dist]),
   :doc
   "Return the distribution of the sum over n samples from the\ndistribution dist.",
   :name "sample-sum"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj#L35",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.random-numbers-api.html#clojure.contrib.probabilities.random-numbers/lcg",
   :namespace "clojure.contrib.probabilities.random-numbers",
   :line 35,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :var-type "function",
   :arglists ([modulus multiplier increment seed]),
   :doc "Create a linear congruential generator",
   :name "lcg"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//probabilities.random-numbers-api.html#clojure.contrib.probabilities.random-numbers/rand-stream",
   :namespace "clojure.contrib.probabilities.random-numbers",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/probabilities/random_numbers.clj",
   :var-type "var",
   :doc
   "A random number stream based on clojure.core/rand. Note that this\ngenerator uses an internal mutable state. The state is thus not stored\nin the stream object and cannot be restored.",
   :name "rand-stream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L42",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/*enable-profiling*",
   :namespace "clojure.contrib.profile",
   :line 42,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "var",
   :doc
   "Set this to false before loading/compiling to omit\nprofiling code.",
   :name "*enable-profiling*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L95",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/print-summary",
   :namespace "clojure.contrib.profile",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "function",
   :arglists ([profile-summary]),
   :doc "Prints a table of the results returned by summarize.",
   :name "print-summary"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L45",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/prof",
   :namespace "clojure.contrib.profile",
   :line 45,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "macro",
   :arglists ([name & body]),
   :doc
   "If *enable-profiling* is true, wraps body in profiling code.\nReturns the result of body. Profile timings will be stored in\n*profile-data* using name, which must be a keyword, as the key.\nTimings are measured with System/nanoTime.",
   :name "prof"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L106",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/profile",
   :namespace "clojure.contrib.profile",
   :line 106,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Runs body with profiling enabled, then prints a summary of\nresults.  Returns nil.",
   :name "profile"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/summarize",
   :namespace "clojure.contrib.profile",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "function",
   :arglists ([profile-data]),
   :doc
   "Takes the raw data returned by with-profile-data and returns a map\nfrom names to summary statistics.  Each value in the map will look\nlike:\n\n   {:mean ..., :min ..., :max ..., :count ..., :sum ...}\n\n:mean, :min, and :max are how long the profiled section took to run,\nin nanoseconds.  :count is the total number of times the profiled\nsection was executed.  :sum is the total amount of time spent in the\nprofiled section, in nanoseconds.",
   :name "summarize"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/profile.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//profile-api.html#clojure.contrib.profile/with-profile-data",
   :namespace "clojure.contrib.profile",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/profile.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Executes body with *profile-data* bound to an atom of a new map.\nReturns the raw profile data as a map.  Keys in the map are profile\nnames (keywords), and values are lists of elapsed time, in\nnanoseconds.",
   :name "with-profile-data"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L53",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/as-properties",
   :namespace "clojure.contrib.properties",
   :line 53,
   :file "clojure/contrib/properties.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "Convert any seq of pairs to a java.utils.Properties instance.\nUses as-str to convert both keys and values into strings.",
   :name "as-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/get-system-property",
   :namespace "clojure.contrib.properties",
   :line 18,
   :file "clojure/contrib/properties.clj",
   :var-type "function",
   :arglists ([stringable] [stringable default]),
   :doc "Get a system property.",
   :name "get-system-property"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/read-properties",
   :namespace "clojure.contrib.properties",
   :line 63,
   :file "clojure/contrib/properties.clj",
   :var-type "function",
   :arglists ([file-able]),
   :doc "Read properties from file-able.",
   :name "read-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L25",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/set-system-properties",
   :namespace "clojure.contrib.properties",
   :line 25,
   :file "clojure/contrib/properties.clj",
   :var-type "function",
   :arglists ([settings]),
   :doc "Set some system properties. Nil clears a property.",
   :name "set-system-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/with-system-properties",
   :namespace "clojure.contrib.properties",
   :line 33,
   :file "clojure/contrib/properties.clj",
   :var-type "macro",
   :arglists ([settings & body]),
   :doc
   "setting => property-name value\n\nSets the system properties to the supplied values, executes the body, and\nsets the properties back to their original values. Values of nil are\ntranslated to a clearing of the property.",
   :name "with-system-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/e1c5056f0bea0aadebf6b2384d66a36c034d3251/src/main/clojure/clojure/contrib/properties.clj#L70",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//properties-api.html#clojure.contrib.properties/write-properties",
   :namespace "clojure.contrib.properties",
   :line 70,
   :file "clojure/contrib/properties.clj",
   :var-type "function",
   :arglists ([m file-able] [m file-able comments]),
   :doc "Write properties to file-able.",
   :name "write-properties"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/prxml.clj#L32",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/*html-compatible*",
   :namespace "clojure.contrib.prxml",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/prxml.clj",
   :var-type "var",
   :doc "If true, empty tags will have a space before the closing />",
   :name "*html-compatible*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/prxml.clj#L36",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/*prxml-indent*",
   :namespace "clojure.contrib.prxml",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/prxml.clj",
   :var-type "var",
   :doc
   "The number of spaces to indent sub-tags.  nil for no indent\nand no extra line-breaks.",
   :name "*prxml-indent*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/prxml.clj#L146",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//prxml-api.html#clojure.contrib.prxml/prxml",
   :namespace "clojure.contrib.prxml",
   :line 146,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/prxml.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Print XML to *out*.  Vectors become XML tags: the first item is the\ntag name; optional second item is a map of attributes.\n\nSequences are processed recursively, so you can use map and other\nsequence functions inside prxml.\n\n  (prxml [:p {:class \"greet\"} [:i \"Ladies & gentlemen\"]])\n  ; => <p class=\"greet\"><i>Ladies &amp; gentlemen</i></p>\n\nPSEUDO-TAGS: some keywords have special meaning:\n\n  :raw!      do not XML-escape contents\n  :comment!  create an XML comment\n  :decl!     create an XML declaration, with attributes\n  :cdata!    create a CDATA section\n  :doctype!  create a DOCTYPE!\n\n  (prxml [:p [:raw! \"<i>here & gone</i>\"]])\n  ; => <p><i>here & gone</i></p>\n\n  (prxml [:decl! {:version \"1.1\"}])\n  ; => <?xml version=\"1.1\" encoding=\"UTF-8\"?>",
   :name "prxml"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/91582e13e7b93b23fb53f821caa73fd23368d551/src/main/clojure/clojure/contrib/reflect.clj#L12",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//reflect-api.html#clojure.contrib.reflect/call-method",
   :namespace "clojure.contrib.reflect",
   :line 12,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/reflect.clj",
   :var-type "function",
   :arglists ([klass method-name params obj & args]),
   :doc
   "Calls a private or protected method.\n\nparams is a vector of classes which correspond to the arguments to\nthe method e\n\nobj is nil for static methods, the instance object otherwise.\n\nThe method-name is given a symbol or a keyword (something Named).",
   :name "call-method"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/91582e13e7b93b23fb53f821caa73fd23368d551/src/main/clojure/clojure/contrib/reflect.clj#L27",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//reflect-api.html#clojure.contrib.reflect/get-field",
   :namespace "clojure.contrib.reflect",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/reflect.clj",
   :var-type "function",
   :arglists ([klass field-name obj]),
   :doc
   "Access to private or protected field.  field-name is a symbol or\nkeyword.",
   :name "get-field"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L208",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/print-repl-info",
   :namespace "clojure.contrib.repl-ln",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Prints info about the current repl",
   :name "print-repl-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L217",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl",
   :namespace "clojure.contrib.repl-ln",
   :line 217,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   "A repl that supports line numbers. For definitions and evaluations made\nat the repl, the repl-name and line number will be reported as the\norigin. Use set-repl-name and set-repl-prompt to customize the repl name\nand prompt. This repl supports all of the keyword arguments documented\nfor clojure.main/repl with the following change and additions:\n\n     - :prompt has a new default\n       default: #(clojure.core/print (repl-prompt))\n\n     - :name-fmt, Name format string\n       default: the name-fmt of the parent repl, or \"repl-%S\"\n\n     - :prompt-fmt, Prompt format string\n       default: the prompt-fmt of the parent repl, or \"%S:%L %N=> \"",
   :name "repl"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L202",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl-info",
   :namespace "clojure.contrib.repl-ln",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns a map of info about the current repl",
   :name "repl-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L148",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/repl-prompt",
   :namespace "clojure.contrib.repl-ln",
   :line 148,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns the current repl prompt based on this repl's prompt-fmt",
   :name "repl-prompt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L157",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/set-repl-name",
   :namespace "clojure.contrib.repl-ln",
   :line 157,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([] [name-fmt]),
   :doc
   "Sets the repl name format to the string name-fmt. Include the following\ncodes in the name to make the corresponding dynamic values part of it:\n\n  %S - repl serial number\n  %T - thread id\n  %D - nesting depth in this thread\n\nWith no arguments, resets the repl name to its default: \"repl-%S\"",
   :name "set-repl-name"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L180",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/set-repl-prompt",
   :namespace "clojure.contrib.repl-ln",
   :line 180,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([] [prompt-fmt]),
   :doc
   "Sets the repl prompt. Include the following codes in the prompt to make\nthe corresponding dynamic values part of it:\n\n  %S - repl serial number\n  %T - thread id\n  %D - nesting depth in this thread\n  %L - input line number\n  %N - namespace name\n\nWith no arguments, resets the repl pompt to its default: \"%S:%L %N=> \"",
   :name "set-repl-prompt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_ln.clj#L119",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-ln-api.html#clojure.contrib.repl-ln/stream-repl",
   :namespace "clojure.contrib.repl-ln",
   :line 119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_ln.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   "Repl entry point that provides convenient overriding of input, output,\nand err streams via sequential keyword-value pairs. Default values\nfor :in, :out, and :err are streams associated with System/in,\nSystem/out, and System/err using UTF-8 encoding. Also supports all the\noptions provided by clojure.contrib.repl-ln/repl.",
   :name "stream-repl"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/*local-javadocs*",
   :namespace "clojure.contrib.repl-utils",
   :line 18,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "var",
   :doc
   "Ref to a list of local paths for Javadoc-generated HTML\nfiles.",
   :name "*local-javadocs*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/*remote-javadocs*",
   :namespace "clojure.contrib.repl-utils",
   :line 28,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "var",
   :doc
   "Ref to a map from package name prefixes to URLs for remote\nJavadocs.",
   :name "*remote-javadocs*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L168",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-break-thread!",
   :namespace "clojure.contrib.repl-utils",
   :line 168,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "function",
   :arglists ([] [t]),
   :doc
   "Add the given thread to break-threads so that it will be stopped\nany time the user presses Ctrl-C.  Calls start-handling-break for\nyou.  Adds the current thread if none is given.",
   :name "add-break-thread!"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L43",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-local-javadoc",
   :namespace "clojure.contrib.repl-utils",
   :line 43,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "function",
   :arglists ([path]),
   :doc "Adds to the list of local Javadoc paths.",
   :name "add-local-javadoc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L48",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/add-remote-javadoc",
   :namespace "clojure.contrib.repl-utils",
   :line 48,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "function",
   :arglists ([package-prefix url]),
   :doc
   "Adds to the list of remote Javadoc URLs.  package-prefix is the\nbeginning of the package name that has docs at this URL.",
   :name "add-remote-javadoc"}
  {:arglists ([str-or-pattern]),
   :name "apropos",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L133",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/apropos",
   :doc
   "Given a regular expression or stringable thing, return a seq of \nall definitions in all currently-loaded namespaces that match the\nstr-or-pattern.",
   :var-type "function",
   :line 133,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L149",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/break-threads",
   :namespace "clojure.contrib.repl-utils",
   :line 149,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "var",
   :doc
   "Threads to stop when Ctrl-C is pressed.  See 'add-break-thread!'",
   :name "break-threads"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L181",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/expression-info",
   :namespace "clojure.contrib.repl-utils",
   :line 181,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "function",
   :arglists ([expr]),
   :doc
   "Uses the Clojure compiler to analyze the given s-expr.  Returns\na map with keys :class and :primitive? indicating what the compiler\nconcluded about the return value of the expression.  Returns nil if\nnot type info can be determined at compile-time.\n\nExample: (expression-info '(+ (int 5) (float 10)))\nReturns: {:class float, :primitive? true}",
   :name "expression-info"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/find-javadoc-url",
   :namespace "clojure.contrib.repl-utils",
   :line 54,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "function",
   :arglists ([classname]),
   :doc
   "Searches for a URL for the given class name.  Tries\n*local-javadocs* first, then *remote-javadocs*.  Returns a string.",
   :name "find-javadoc-url"}
  {:arglists ([x]),
   :name "get-source",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L100",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/get-source",
   :doc
   "Returns a string of the source code for the given symbol, if it can\nfind it.  This requires that the symbol resolve to a Var defined in\na namespace for which the .clj is in the classpath.  Returns nil if\nit can't find the source.  For most REPL usage, 'source' is more\nconvenient.\n\nExample: (get-source 'filter)",
   :var-type "function",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/repl_utils/javadoc.clj#L74",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/javadoc",
   :namespace "clojure.contrib.repl-utils",
   :line 74,
   :file "clojure/contrib/repl_utils/javadoc.clj",
   :var-type "function",
   :arglists ([class-or-object]),
   :doc
   "Opens a browser window displaying the javadoc for the argument.\nTries *local-javadocs* first, then *remote-javadocs*.",
   :name "javadoc"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L206",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/run",
   :namespace "clojure.contrib.repl-utils",
   :line 206,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "macro",
   :arglists ([ns-name & args]),
   :doc
   "Loads the specified namespace and invokes its \"main\" function with\noptional args. ns-name is not evaluated.",
   :name "run"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L199",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/run*",
   :namespace "clojure.contrib.repl-utils",
   :line 199,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "function",
   :arglists ([ns-sym & args]),
   :doc
   "Loads the specified namespace and invokes its \"main\" function with\noptional args.",
   :name "run*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/show",
   :namespace "clojure.contrib.repl-utils",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "function",
   :arglists ([x] [x selector]),
   :doc
   "With one arg prints all static and instance members of x or (class x).\nEach member is listed with a number which can be given as 'selector'\nto return the member object -- the REPL will print more details for\nthat member.\n\nThe selector also may be a string or regex, in which case only\nmembers whose names match 'selector' as a case-insensitive regex\nwill be printed.\n\nFinally, the selector also may be a predicate, in which case only\nmembers for which the predicate returns true will be printed.  The\npredicate will be passed a single argument, a map that includes the\n:text that will be printed and the :member object itself, as well as\nall the properies of the member object as translated by 'bean'.\n\nExamples: (show Integer)  (show [])  (show String 23)  (show String \"case\")",
   :name "show"}
  {:arglists ([n]),
   :name "source",
   :namespace "clojure.contrib.repl-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L123",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/source",
   :doc
   "Prints the source code for the given symbol, if it can find it.\nThis requires that the symbol resolve to a Var defined in a\nnamespace for which the .clj is in the classpath.\n\nExample: (source filter)",
   :var-type "macro",
   :line 123,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/fdda2d2c1cb046203470eaed264810ddaf895bcf/src/main/clojure/clojure/contrib/repl_utils.clj#L153",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//repl-utils-api.html#clojure.contrib.repl-utils/start-handling-break",
   :namespace "clojure.contrib.repl-utils",
   :line 153,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/repl_utils.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Register INT signal handler.  After calling this, Ctrl-C will cause\nall break-threads to be stopped.  See 'add-break-thread!'",
   :name "start-handling-break"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L188",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/fill-queue",
   :namespace "clojure.contrib.seq",
   :line 188,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([filler-func & optseq]),
   :doc
   "filler-func will be called in another thread with a single arg\n'fill'.  filler-func may call fill repeatedly with one arg each\ntime which will be pushed onto a queue, blocking if needed until\nthis is possible.  fill-queue will return a lazy seq of the values\nfiller-func has pushed onto the queue, blocking if needed until each\nnext element becomes available.  filler-func's return value is ignored.",
   :name "fill-queue"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L179",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/find-first",
   :namespace "clojure.contrib.seq",
   :line 179,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([pred coll]),
   :doc
   "Returns the first item of coll for which (pred item) returns logical true.\nConsumes sequences up to the first match, will consume the entire sequence\nand return nil if no match is found.",
   :name "find-first"}
  {:arglists ([x]),
   :name "flatten",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L35",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/flatten",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nTakes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil.",
   :var-type "function",
   :line 35,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([coll]),
   :name "frequencies",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L89",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/frequencies",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a map from distinct items in coll to the number of times\nthey appear.",
   :var-type "function",
   :line 89,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([f coll]),
   :name "group-by",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L61",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/group-by",
   :doc
   "DEPRECATED. Prefer clojure.core version.\n Returns a sorted map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll.",
   :var-type "function",
   :line 61,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([coll x]),
   :name "includes?",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L229",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/includes?",
   :doc
   "Returns true if coll contains something equal (with =) to x,\nin linear time. Deprecated. Prefer 'contains?' for key testing,\nor 'some' for ad hoc linear searches.",
   :var-type "function",
   :line 229,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/indexed",
   :namespace "clojure.contrib.seq",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a lazy sequence of [index, item] pairs, where items come\nfrom 's' and indexes count up from zero.\n\n(indexed '(a b c d))  =>  ([0 a] [1 b] [2 c] [3 d])",
   :name "indexed"}
  {:arglists ([n coll] [n step coll]),
   :name "partition-all",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L139",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/partition-all",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a lazy sequence of lists like clojure.core/partition, but may\ninclude lists with fewer than n items at the end.",
   :var-type "function",
   :line 139,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:arglists ([f coll]),
   :name "partition-by",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L76",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/partition-by",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nApplies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of lazy seqs.",
   :var-type "function",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L223",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/positions",
   :namespace "clojure.contrib.seq",
   :line 223,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([pred coll]),
   :doc
   "Returns a lazy sequence containing the positions at which pred\nis true for items in coll.",
   :name "positions"}
  {:arglists ([s]),
   :name "rand-elt",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L160",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rand-elt",
   :doc
   "DEPRECATED. Prefer clojure.core/rand-nth.\nReturn a random element of this seq",
   :var-type "function",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L108",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rec-cat",
   :namespace "clojure.contrib.seq",
   :line 108,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "macro",
   :arglists ([binding-name & exprs]),
   :doc
   "Similar to lazy-cat but binds the resulting sequence to the supplied \nbinding-name, allowing for recursive expressions.",
   :name "rec-cat"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L101",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rec-seq",
   :namespace "clojure.contrib.seq",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "macro",
   :arglists ([binding-name & body]),
   :doc
   "Similar to lazy-seq but binds the resulting seq to the supplied \nbinding-name, allowing for recursive expressions.",
   :name "rec-seq"}
  {:arglists ([f coll] [f init coll]),
   :name "reductions",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L117",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/reductions",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init.",
   :var-type "function",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L129",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/rotations",
   :namespace "clojure.contrib.seq",
   :line 129,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns a lazy seq of all rotations of a seq",
   :name "rotations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L45",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/separate",
   :namespace "clojure.contrib.seq",
   :line 45,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj",
   :var-type "function",
   :arglists ([f s]),
   :doc
   "Returns a vector:\n[ (filter f s), (filter (complement f) s) ]",
   :name "separate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L168",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/seq-on",
   :namespace "clojure.contrib.seq",
   :line 168,
   :file "clojure/contrib/seq.clj",
   :var-type "multimethod",
   :arglists ([s]),
   :doc
   "Returns a seq on the object s. Works like the built-in seq but as\na multimethod that can have implementations for new classes and types.",
   :name "seq-on"}
  {:arglists ([coll]),
   :name "shuffle",
   :namespace "clojure.contrib.seq",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/seq.clj#L151",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-api.html#clojure.contrib.seq/shuffle",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturn a random permutation of coll",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L193",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/fill-queue",
   :namespace "clojure.contrib.seq-utils",
   :line 193,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([filler-func & optseq]),
   :doc
   "filler-func will be called in another thread with a single arg\n'fill'.  filler-func may call fill repeatedly with one arg each\ntime which will be pushed onto a queue, blocking if needed until\nthis is possible.  fill-queue will return a lazy seq of the values\nfiller-func has pushed onto the queue, blocking if needed until each\nnext element becomes available.  filler-func's return value is ignored.",
   :name "fill-queue"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L184",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/find-first",
   :namespace "clojure.contrib.seq-utils",
   :line 184,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([pred coll]),
   :doc
   "Returns the first item of coll for which (pred item) returns logical true.\nConsumes sequences up to the first match, will consume the entire sequence\nand return nil if no match is found.",
   :name "find-first"}
  {:arglists ([x]),
   :name "flatten",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L39",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/flatten",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nTakes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil.",
   :var-type "function",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:arglists ([coll]),
   :name "frequencies",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L93",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/frequencies",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a map from distinct items in coll to the number of times\nthey appear.",
   :var-type "function",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:arglists ([f coll]),
   :name "group-by",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L65",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/group-by",
   :doc
   "DEPRECATED. Prefer clojure.core version.\n Returns a sorted map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll.",
   :var-type "function",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:arglists ([coll x]),
   :name "includes?",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L234",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/includes?",
   :doc
   "Returns true if coll contains something equal (with =) to x,\nin linear time. Deprecated. Prefer 'contains?' for key testing,\nor 'some' for ad hoc linear searches.",
   :var-type "function",
   :line 234,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L55",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/indexed",
   :namespace "clojure.contrib.seq-utils",
   :line 55,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a lazy sequence of [index, item] pairs, where items come\nfrom 's' and indexes count up from zero.\n\n(indexed '(a b c d))  =>  ([0 a] [1 b] [2 c] [3 d])",
   :name "indexed"}
  {:arglists ([n coll] [n step coll]),
   :name "partition-all",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L143",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/partition-all",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a lazy sequence of lists like clojure.core/partition, but may\ninclude lists with fewer than n items at the end.",
   :var-type "function",
   :line 143,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:arglists ([f coll]),
   :name "partition-by",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L80",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/partition-by",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nApplies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of lazy seqs.",
   :var-type "function",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/positions",
   :namespace "clojure.contrib.seq-utils",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([pred coll]),
   :doc
   "Returns a lazy sequence containing the positions at which pred\nis true for items in coll.",
   :name "positions"}
  {:arglists ([s]),
   :name "rand-elt",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L164",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/rand-elt",
   :doc
   "DEPRECATED. Prefer clojure.core/rand-nth.\nReturn a random element of this seq",
   :var-type "function",
   :line 164,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L112",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/rec-cat",
   :namespace "clojure.contrib.seq-utils",
   :line 112,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "macro",
   :arglists ([binding-name & exprs]),
   :doc
   "Similar to lazy-cat but binds the resulting sequence to the supplied \nbinding-name, allowing for recursive expressions.",
   :name "rec-cat"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L105",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/rec-seq",
   :namespace "clojure.contrib.seq-utils",
   :line 105,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "macro",
   :arglists ([binding-name & body]),
   :doc
   "Similar to lazy-seq but binds the resulting seq to the supplied \nbinding-name, allowing for recursive expressions.",
   :name "rec-seq"}
  {:arglists ([f coll] [f init coll]),
   :name "reductions",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L121",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/reductions",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init.",
   :var-type "function",
   :line 121,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L133",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/rotations",
   :namespace "clojure.contrib.seq-utils",
   :line 133,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns a lazy seq of all rotations of a seq",
   :name "rotations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/separate",
   :namespace "clojure.contrib.seq-utils",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "function",
   :arglists ([f s]),
   :doc
   "Returns a vector:\n[ (filter f s), (filter (complement f) s) ]",
   :name "separate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L173",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/seq-on",
   :namespace "clojure.contrib.seq-utils",
   :line 173,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj",
   :var-type "multimethod",
   :arglists ([s]),
   :doc
   "Returns a seq on the object s. Works like the built-in seq but as\na multimethod that can have implementations for new classes and types.",
   :name "seq-on"}
  {:arglists ([coll]),
   :name "shuffle",
   :namespace "clojure.contrib.seq-utils",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/7f2b012cb679d0ad19f8949c95b7ef479fe1ff22/src/main/clojure/clojure/contrib/seq_utils.clj#L155",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//seq-utils-api.html#clojure.contrib.seq-utils/shuffle",
   :doc
   "DEPRECATED. Prefer clojure.core version.\nReturn a random permutation of coll",
   :var-type "function",
   :line 155,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/seq_utils.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/server_socket.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//server-socket-api.html#clojure.contrib.server-socket/create-repl-server",
   :namespace "clojure.contrib.server-socket",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/server_socket.clj",
   :var-type "function",
   :arglists ([port backlog bind-addr] [port backlog] [port]),
   :doc "create a repl on a socket",
   :name "create-repl-server"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/server_socket.clj#L53",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//server-socket-api.html#clojure.contrib.server-socket/create-server",
   :namespace "clojure.contrib.server-socket",
   :line 53,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/server_socket.clj",
   :var-type "function",
   :arglists
   ([port fun backlog bind-addr] [port fun backlog] [port fun]),
   :doc
   "Creates a server socket on port. Upon accept, a new thread is\ncreated which calls:\n\n(fun input-stream output-stream)\n\nOptional arguments support specifying a listen backlog and binding\nto a specific endpoint.",
   :name "create-server"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/f671a27b020bf746d02b9dbeeafdb4bd49ebf0b0/src/main/clojure/clojure/contrib/set.clj#L40",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/proper-subset?",
   :namespace "clojure.contrib.set",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/set.clj",
   :var-type "function",
   :arglists ([set1 set2]),
   :doc "Is s1 a proper subset of s2?",
   :name "proper-subset?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/f671a27b020bf746d02b9dbeeafdb4bd49ebf0b0/src/main/clojure/clojure/contrib/set.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/proper-superset?",
   :namespace "clojure.contrib.set",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/set.clj",
   :var-type "function",
   :arglists ([set1 set2]),
   :doc "Is s1 a proper superset of s2?",
   :name "proper-superset?"}
  {:arglists ([set1 set2]),
   :name "subset?",
   :namespace "clojure.contrib.set",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/f671a27b020bf746d02b9dbeeafdb4bd49ebf0b0/src/main/clojure/clojure/contrib/set.clj#L24",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/subset?",
   :doc "Is set1 a subset of set2?",
   :var-type "function",
   :line 24,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/set.clj"}
  {:arglists ([set1 set2]),
   :name "superset?",
   :namespace "clojure.contrib.set",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/f671a27b020bf746d02b9dbeeafdb4bd49ebf0b0/src/main/clojure/clojure/contrib/set.clj#L32",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//set-api.html#clojure.contrib.set/superset?",
   :doc "Is set1 a superset of set2?",
   :var-type "function",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/set.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6e721ff777dd52801cafe693868d8118a62076de/src/main/clojure/clojure/contrib/shell.clj#L86",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//shell-api.html#clojure.contrib.shell/sh",
   :namespace "clojure.contrib.shell",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/shell.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Passes the given strings to Runtime.exec() to launch a sub-process.\n\nOptions are\n\n:in    may be given followed by a String specifying text to be fed to the \n       sub-process's stdin.  \n:out   option may be given followed by :bytes or a String. If a String \n       is given, it will be used as a character encoding name (for \n       example \"UTF-8\" or \"ISO-8859-1\") to convert the \n       sub-process's stdout to a String which is returned.\n       If :bytes is given, the sub-process's stdout will be stored in \n       a byte array and returned.  Defaults to UTF-8.\n:return-map\n       when followed by boolean true, sh returns a map of\n         :exit => sub-process's exit code\n         :out  => sub-process's stdout (as byte[] or String)\n         :err  => sub-process's stderr (as byte[] or String)\n       when not given or followed by false, sh returns a single\n       array or String of the sub-process's stdout followed by its\n       stderr\n:env   override the process env with a map (or the underlying Java\n       String[] if you are a masochist).\n:dir   override the process dir with a String or java.io.File.\n\nYou can bind :env or :dir for multiple operations using with-sh-env\nand with-sh-dir.",
   :name "sh"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6e721ff777dd52801cafe693868d8118a62076de/src/main/clojure/clojure/contrib/shell_out.clj#L86",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//shell-out-api.html#clojure.contrib.shell-out/sh",
   :namespace "clojure.contrib.shell-out",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/shell_out.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Passes the given strings to Runtime.exec() to launch a sub-process.\n\nOptions are\n\n:in    may be given followed by a String specifying text to be fed to the \n       sub-process's stdin.  \n:out   option may be given followed by :bytes or a String. If a String \n       is given, it will be used as a character encoding name (for \n       example \"UTF-8\" or \"ISO-8859-1\") to convert the \n       sub-process's stdout to a String which is returned.\n       If :bytes is given, the sub-process's stdout will be stored in \n       a byte array and returned.  Defaults to UTF-8.\n:return-map\n       when followed by boolean true, sh returns a map of\n         :exit => sub-process's exit code\n         :out  => sub-process's stdout (as byte[] or String)\n         :err  => sub-process's stderr (as byte[] or String)\n       when not given or followed by false, sh returns a single\n       array or String of the sub-process's stdout followed by its\n       stderr\n:env   override the process env with a map (or the underlying Java\n       String[] if you are a masochist).\n:dir   override the process dir with a String or java.io.File.\n\nYou can bind :env or :dir for multiple operations using with-sh-env\nand with-sh-dir.",
   :name "sh"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/singleton.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//singleton-api.html#clojure.contrib.singleton/global-singleton",
   :namespace "clojure.contrib.singleton",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/singleton.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "Returns a global singleton function.  f is a function of no\narguments that creates and returns some object.  The singleton\nfunction will call f just once, the first time it is needed, and\ncache the value for all subsequent calls.\n\nWarning: global singletons are often unsafe in multi-threaded code.\nConsider per-thread-singleton instead.",
   :name "global-singleton"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/singleton.clj#L41",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//singleton-api.html#clojure.contrib.singleton/per-thread-singleton",
   :namespace "clojure.contrib.singleton",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/singleton.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "Returns a per-thread singleton function.  f is a function of no\narguments that creates and returns some object.  The singleton\nfunction will call f only once for each thread, and cache its value\nfor subsequent calls from the same thread.  This allows you to\nsafely and lazily initialize shared objects on a per-thread basis.\n\nWarning: due to a bug in JDK 5, it may not be safe to use a\nper-thread-singleton in the initialization function for another\nper-thread-singleton.  See\nhttp://bugs.sun.com/bugdatabase/view_bug.do?bug_id=5025230",
   :name "per-thread-singleton"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L30",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/connection",
   :namespace "clojure.contrib.sql",
   :line 30,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns the current database connection (or throws if there is none)",
   :name "connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L103",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/create-table",
   :namespace "clojure.contrib.sql",
   :line 103,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([name & specs]),
   :doc
   "Creates a table on the open database connection given a table name and\nspecs. Each spec is either a column spec: a vector containing a column\nname and optionally a type and other constraints, or a table-level\nconstraint: a vector containing words that express the constraint. All\nwords used to describe the table may be supplied as strings or keywords.",
   :name "create-table"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L157",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/delete-rows",
   :namespace "clojure.contrib.sql",
   :line 157,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table where-params]),
   :doc
   "Deletes rows from a table. where-params is a vector containing a string\nproviding the (optionally parameterized) selection criteria followed by\nvalues for any parameters.",
   :name "delete-rows"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L81",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/do-commands",
   :namespace "clojure.contrib.sql",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([& commands]),
   :doc "Executes SQL commands on the open database connection.",
   :name "do-commands"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/do-prepared",
   :namespace "clojure.contrib.sql",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([sql & param-groups]),
   :doc
   "Executes an (optionally parameterized) SQL prepared statement on the\nopen database connection. Each param-group is a seq of values for all of\nthe parameters.",
   :name "do-prepared"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L119",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/drop-table",
   :namespace "clojure.contrib.sql",
   :line 119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([name]),
   :doc
   "Drops a table on the open database connection given its name, a string\nor keyword",
   :name "drop-table"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/find-connection",
   :namespace "clojure.contrib.sql",
   :line 29,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns the current database connection (or nil if there is none)",
   :name "find-connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L150",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-records",
   :namespace "clojure.contrib.sql",
   :line 150,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table & records]),
   :doc
   "Inserts records into a table. records are maps from strings or\nkeywords (identifying columns) to values.",
   :name "insert-records"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L144",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-rows",
   :namespace "clojure.contrib.sql",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table & rows]),
   :doc
   "Inserts complete rows into a table. Each row is a vector of values for\neach of the table's columns in order.",
   :name "insert-rows"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L126",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/insert-values",
   :namespace "clojure.contrib.sql",
   :line 126,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table column-names & value-groups]),
   :doc
   "Inserts rows into a table with values for specified columns only.\ncolumn-names is a vector of strings or keywords identifying columns. Each\nvalue-group is a vector containing a values for each column in\norder. When inserting complete rows (all columns), consider using\ninsert-rows instead.",
   :name "insert-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L75",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/is-rollback-only",
   :namespace "clojure.contrib.sql",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns true if the outermost transaction will rollback rather than\ncommit when complete",
   :name "is-rollback-only"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L69",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/set-rollback-only",
   :namespace "clojure.contrib.sql",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Marks the outermost transaction such that it will rollback rather than\ncommit when complete",
   :name "set-rollback-only"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L58",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/transaction",
   :namespace "clojure.contrib.sql",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Evaluates body as a transaction on the open database connection. Any\nnested transactions are absorbed into the outermost transaction. By\ndefault, all database updates are committed together as a group after\nevaluating the outermost body, or rolled back on any uncaught\nexception. If set-rollback-only is called within scope of the outermost\ntransaction, the entire transaction will be rolled back rather than\ncommitted when complete.",
   :name "transaction"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L182",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/update-or-insert-values",
   :namespace "clojure.contrib.sql",
   :line 182,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table where-params record]),
   :doc
   "Updates values on selected rows in a table, or inserts a new row when no\nexisting row matches the selection criteria. where-params is a vector\ncontaining a string providing the (optionally parameterized) selection\ncriteria followed by values for any parameters. record is a map from\nstrings or keywords (identifying columns) to updated values.",
   :name "update-or-insert-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L168",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/update-values",
   :namespace "clojure.contrib.sql",
   :line 168,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "function",
   :arglists ([table where-params record]),
   :doc
   "Updates values on selected rows in a table. where-params is a vector\ncontaining a string providing the (optionally parameterized) selection\ncriteria followed by values for any parameters. record is a map from\nstrings or keywords (identifying columns) to updated values.",
   :name "update-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L32",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/with-connection",
   :namespace "clojure.contrib.sql",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "macro",
   :arglists ([db-spec & body]),
   :doc
   "Evaluates body in the context of a new connection to a database then\ncloses the connection. db-spec is a map containing values for one of the\nfollowing parameter sets:\n\nFactory:\n  :factory     (required) a function of one argument, a map of params\n  (others)     (optional) passed to the factory function in a map\n\nDriverManager:\n  :classname   (required) a String, the jdbc driver class name\n  :subprotocol (required) a String, the jdbc subprotocol\n  :subname     (required) a String, the jdbc subname\n  (others)     (optional) passed to the driver as properties.\n\nDataSource:\n  :datasource  (required) a javax.sql.DataSource\n  :username    (optional) a String\n  :password    (optional) a String, required if :username is supplied\n\nJNDI:\n  :name        (required) a String or javax.naming.Name\n  :environment (optional) a java.util.Map",
   :name "with-connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/sql.clj#L195",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql/with-query-results",
   :namespace "clojure.contrib.sql",
   :line 195,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql.clj",
   :var-type "macro",
   :arglists ([results sql-params & body]),
   :doc
   "Executes a query, then evaluates body with results bound to a seq of the\nresults. sql-params is a vector containing a string providing\nthe (optionally parameterized) SQL query followed by values for any\nparameters.",
   :name "with-query-results"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L99",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/chomp",
   :namespace "clojure.contrib.str-utils",
   :line 99,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Removes all trailing newline \\n or return \\r characters from\nstring.  Note: String.trim() is similar and faster.",
   :name "chomp"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L94",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/chop",
   :namespace "clojure.contrib.str-utils",
   :line 94,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Removes the last character of string.",
   :name "chop"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L53",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/re-gsub",
   :namespace "clojure.contrib.str-utils",
   :line 53,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([regex replacement string]),
   :doc
   "Replaces all instances of 'pattern' in 'string' with\n'replacement'.  Like Ruby's 'String#gsub'.\n\nIf (ifn? replacment) is true, the replacement is called with the\nmatch.\n",
   :name "re-gsub"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L31",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/re-partition",
   :namespace "clojure.contrib.str-utils",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([re string]),
   :doc
   "Splits the string into a lazy sequence of substrings, alternating\nbetween substrings that match the patthern and the substrings\nbetween the matches.  The sequence always starts with the substring\nbefore the first match, or an empty string if the beginning of the\nstring matches.\n\nFor example: (re-partition #\"[a-z]+\" \"abc123def\")\n\nReturns: (\"\" \"abc\" \"123\" \"def\")",
   :name "re-partition"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L24",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/re-split",
   :namespace "clojure.contrib.str-utils",
   :line 24,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([pattern string] [pattern string limit]),
   :doc
   "Splits the string on instances of 'pattern'.  Returns a sequence of\nstrings.  Optional 'limit' argument is the maximum number of\nsplits.  Like Perl's 'split'.",
   :name "re-split"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L69",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/re-sub",
   :namespace "clojure.contrib.str-utils",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([regex replacement string]),
   :doc
   "Replaces the first instance of 'pattern' in 'string' with\n'replacement'.  Like Ruby's 'String#sub'.\n\nIf (ifn? replacement) is true, the replacement is called with\nthe match.\n",
   :name "re-sub"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils.clj#L87",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils-api.html#clojure.contrib.str-utils/str-join",
   :namespace "clojure.contrib.str-utils",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils.clj",
   :var-type "function",
   :arglists ([separator sequence]),
   :doc
   "Returns a string of all elements in 'sequence', separated by\n'separator'.  Like Perl's 'join'.",
   :name "str-join"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L105",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/blank?",
   :namespace "clojure.contrib.str-utils2",
   :line 105,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "True if s is nil, empty, or contains only whitespace.",
   :name "blank?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L131",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/butlast",
   :namespace "clojure.contrib.str-utils2",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc
   "Returns s without the last n characters.  Returns an empty string\nif n is greater than the length of s.\n\nNote the argument order is the opposite of clojure.core/butlast;\nthis is to keep the string as the first argument for use with ->",
   :name "butlast"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L288",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/capitalize",
   :namespace "clojure.contrib.str-utils2",
   :line 288,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Converts first character of the string to upper-case, all other\ncharacters to lower-case.",
   :name "capitalize"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L261",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/chomp",
   :namespace "clojure.contrib.str-utils2",
   :line 261,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Removes all trailing newline \\n or return \\r characters from\nstring.  Note: String.trim() is similar and faster.",
   :name "chomp"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L252",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/chop",
   :namespace "clojure.contrib.str-utils2",
   :line 252,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Removes the last character of string, does nothing on a zero-length\nstring.",
   :name "chop"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L80",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/codepoints",
   :namespace "clojure.contrib.str-utils2",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a sequence of integer Unicode code points in s.  Handles\nUnicode supplementary characters (above U+FFFF) correctly.",
   :name "codepoints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L367",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/contains?",
   :namespace "clojure.contrib.str-utils2",
   :line 367,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s substring]),
   :doc "True if s contains the substring.",
   :name "contains?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L40",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/dochars",
   :namespace "clojure.contrib.str-utils2",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "macro",
   :arglists ([bindings & body]),
   :doc
   "bindings => [name string]\n\nRepeatedly executes body, with name bound to each character in\nstring.  Does NOT handle Unicode supplementary characters (above\nU+FFFF).",
   :name "dochars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L56",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/docodepoints",
   :namespace "clojure.contrib.str-utils2",
   :line 56,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "macro",
   :arglists ([bindings & body]),
   :doc
   "bindings => [name string]\n\nRepeatedly executes body, with name bound to the integer code point\nof each Unicode character in the string.  Handles Unicode\nsupplementary characters (above U+FFFF) correctly.",
   :name "docodepoints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L120",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/drop",
   :namespace "clojure.contrib.str-utils2",
   :line 120,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc
   "Drops first n characters from s.  Returns an empty string if n is\ngreater than the length of s.\n\nNote the argument order is the opposite of clojure.core/drop; this\nis to keep the string as the first argument for use with ->",
   :name "drop"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L93",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/escape",
   :namespace "clojure.contrib.str-utils2",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s cmap]),
   :doc
   "Returns a new String by applying cmap (a function or a map) to each\ncharacter in s.  If cmap returns nil, the original character is\nadded to the output unchanged.",
   :name "escape"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L372",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/get",
   :namespace "clojure.contrib.str-utils2",
   :line 372,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s i]),
   :doc "Gets the i'th character in string.",
   :name "get"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L320",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/grep",
   :namespace "clojure.contrib.str-utils2",
   :line 320,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([re coll]),
   :doc
   "Filters elements of coll by a regular expression.  The String\nrepresentation (with str) of each element is tested with re-find.",
   :name "grep"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/join",
   :namespace "clojure.contrib.str-utils2",
   :line 246,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([separator coll]),
   :doc
   "Returns a string of all elements in coll, separated by\nseparator.  Like Perl's join.",
   :name "join"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L351",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/lower-case",
   :namespace "clojure.contrib.str-utils2",
   :line 351,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Converts string to all lower-case.",
   :name "lower-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L297",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/ltrim",
   :namespace "clojure.contrib.str-utils2",
   :line 297,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Removes whitespace from the left side of string.",
   :name "ltrim"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L313",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/map-str",
   :namespace "clojure.contrib.str-utils2",
   :line 313,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([f coll]),
   :doc
   "Apply f to each element of coll, concatenate all results into a\nString.",
   :name "map-str"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L326",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/partial",
   :namespace "clojure.contrib.str-utils2",
   :line 326,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([f & args]),
   :doc
   "Like clojure.core/partial for functions that take their primary\nargument first.\n\nTakes a function f and its arguments, NOT INCLUDING the first\nargument.  Returns a new function whose first argument will be the\nfirst argument to f.\n\nExample: (str-utils2/partial str-utils2/take 2)\n         ;;=> (fn [s] (str-utils2/take s 2))",
   :name "partial"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L225",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/partition",
   :namespace "clojure.contrib.str-utils2",
   :line 225,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s re]),
   :doc
   "Splits the string into a lazy sequence of substrings, alternating\nbetween substrings that match the patthern and the substrings\nbetween the matches.  The sequence always starts with the substring\nbefore the first match, or an empty string if the beginning of the\nstring matches.\n\nFor example: (partition \"abc123def\" #\"[a-z]+\")\nreturns: (\"\" \"abc\" \"123\" \"def\")",
   :name "partition"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L149",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/repeat",
   :namespace "clojure.contrib.str-utils2",
   :line 149,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc "Returns a new String containing s repeated n times.",
   :name "repeat"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L159",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/replace",
   :namespace "clojure.contrib.str-utils2",
   :line 159,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "multimethod",
   :arglists ([string pattern replacement]),
   :doc
   "Replaces all instances of pattern in string with replacement.  \n\nAllowed argument types for pattern and replacement are:\n 1. String and String\n 2. Character and Character\n 3. regex Pattern and String\n    (Uses java.util.regex.Matcher.replaceAll)\n 4. regex Pattern and function\n    (Calls function with re-groups of each match, uses return \n     value as replacement.)",
   :name "replace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L195",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/replace-first",
   :namespace "clojure.contrib.str-utils2",
   :line 195,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "multimethod",
   :arglists ([s pattern replacement]),
   :doc
   "Replaces the first instance of pattern in s with replacement.\n\nAllowed argument types for pattern and replacement are:\n 1. String and String\n 2. regex Pattern and String\n    (Uses java.util.regex.Matcher.replaceAll)\n 3. regex Pattern and function",
   :name "replace-first"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L154",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/reverse",
   :namespace "clojure.contrib.str-utils2",
   :line 154,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Returns s with its characters reversed.",
   :name "reverse"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L302",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/rtrim",
   :namespace "clojure.contrib.str-utils2",
   :line 302,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Removes whitespace from the right side of string.",
   :name "rtrim"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L356",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/split",
   :namespace "clojure.contrib.str-utils2",
   :line 356,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s re] [s re limit]),
   :doc
   "Splits string on a regular expression.  Optional argument limit is\nthe maximum number of splits.",
   :name "split"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L307",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/split-lines",
   :namespace "clojure.contrib.str-utils2",
   :line 307,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Splits s on \\n or \\r\\n.",
   :name "split-lines"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L270",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/swap-case",
   :namespace "clojure.contrib.str-utils2",
   :line 270,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Changes upper case characters to lower case and vice-versa.\nHandles Unicode supplementary characters correctly.  Uses the\nlocale-sensitive String.toUpperCase() and String.toLowerCase()\nmethods.",
   :name "swap-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L142",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/tail",
   :namespace "clojure.contrib.str-utils2",
   :line 142,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc "Returns the last n characters of s.",
   :name "tail"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L110",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/take",
   :namespace "clojure.contrib.str-utils2",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s n]),
   :doc
   "Take first n characters from s, up to the length of s.\n\nNote the argument order is the opposite of clojure.core/take; this\nis to keep the string as the first argument for use with ->",
   :name "take"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L362",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/trim",
   :namespace "clojure.contrib.str-utils2",
   :line 362,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Removes whitespace from both ends of string.",
   :name "trim"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/str_utils2.clj#L346",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//str-utils2-api.html#clojure.contrib.str-utils2/upper-case",
   :namespace "clojure.contrib.str-utils2",
   :line 346,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/str_utils2.clj",
   :var-type "function",
   :arglists ([s]),
   :doc "Converts string to all upper-case.",
   :name "upper-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L183",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/defst",
   :namespace "clojure.contrib.stream-utils",
   :line 183,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "macro",
   :arglists ([name args streams & body]),
   :doc
   "Define the stream transformer name by body.\nThe non-stream arguments args and the stream arguments streams\nare given separately, with args being possibly empty.",
   :name "defst"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L73",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/defstream",
   :namespace "clojure.contrib.stream-utils",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "macro",
   :arglists ([type-tag args & body]),
   :doc
   "Define object of the given type as a stream whose implementation\nof stream-next is defined by args and body. This macro adds\na type-specific method for stream-next and derives type\nfrom stream-type.",
   :name "defstream"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L149",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/pick",
   :namespace "clojure.contrib.stream-utils",
   :line 149,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "function",
   :arglists ([n]),
   :doc
   "Return the next value of stream argument n inside a stream\ntransformer. When used inside of defst, the name of the stream\nargument can be used instead of its index n.",
   :name "pick"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L160",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/pick-all",
   :namespace "clojure.contrib.stream-utils",
   :line 160,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "function",
   :arglists ([streams]),
   :doc
   "Return a vector containing the next value of each stream argument\ninside a stream transformer.",
   :name "pick-all"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L201",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-drop",
   :namespace "clojure.contrib.stream-utils",
   :line 201,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "function",
   :arglists ([n stream]),
   :doc
   "Return a stream containing all but the first n elements of stream.",
   :name "stream-drop"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L243",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-filter",
   :namespace "clojure.contrib.stream-utils",
   :line 243,
   :file "clojure/contrib/stream_utils.clj",
   :var-type "multimethod",
   :arglists ([p stream]),
   :doc
   "Return a new stream that contrains the elements of stream\nthat satisfy the predicate p.",
   :name "stream-filter"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L271",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-flatten",
   :namespace "clojure.contrib.stream-utils",
   :line 271,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Converts a stream of sequences into a stream of the elements of the\nsequences. Flattening is not recursive, only one level of nesting\nwill be removed.",
   :name "stream-flatten"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L135",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-m",
   :namespace "clojure.contrib.stream-utils",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "var",
   :doc
   "Monad describing stream computations. The monadic values can be\nof any type handled by stream-next.",
   :name "stream-m"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L219",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-map",
   :namespace "clojure.contrib.stream-utils",
   :line 219,
   :file "clojure/contrib/stream_utils.clj",
   :var-type "multimethod",
   :arglists ([f stream]),
   :doc
   "Return a new stream by mapping the function f on the given stream.",
   :name "stream-map"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L91",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-next",
   :namespace "clojure.contrib.stream-utils",
   :line 91,
   :file "clojure/contrib/stream_utils.clj",
   :var-type "multimethod",
   :arglists ([stream-state]),
   :doc
   "Returns a vector [next-value new-state] where next-value is the next\nitem in the data stream defined by stream-state and new-state\nis the new state of the stream. At the end of the stream,\nnext-value and new-state are nil.",
   :name "stream-next"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L113",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-seq",
   :namespace "clojure.contrib.stream-utils",
   :line 113,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Return a lazy seq on the stream. Also accessible via\nclojure.contrib.seq/seq-on and\nclojure.contrib.generic.collection/seq for streams.",
   :name "stream-seq"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/stream_utils.clj#L69",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//stream-utils-api.html#clojure.contrib.stream-utils/stream-type",
   :namespace "clojure.contrib.stream-utils",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/stream_utils.clj",
   :var-type "var",
   :doc
   "The root type for the stream hierarchy. For each stream type,\nadd a derivation from this type.",
   :name "stream-type"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L315",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/as-str",
   :namespace "clojure.contrib.string",
   :line 315,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([] [x] [x & ys]),
   :doc
   "Like clojure.core/str, but if an argument is a keyword or symbol,\nits name will be used instead of its literal representation.\n\nExample:\n   (str :foo :bar)     ;;=> \":foo:bar\"\n   (as-str :foo :bar)  ;;=> \"foobar\" \n\nNote that this does not apply to keywords or symbols nested within\ndata structures; they will be rendered as with str.\n\nExample:\n   (str {:foo :bar})     ;;=> \"{:foo :bar}\"\n   (as-str {:foo :bar})  ;;=> \"{:foo :bar}\" ",
   :name "as-str"}
  {:arglists ([s]),
   :name "blank?",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L104",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/blank?",
   :doc "True if s is nil, empty, or contains only whitespace.",
   :var-type "function",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L125",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/butlast",
   :namespace "clojure.contrib.string",
   :line 125,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc
   "Returns s without the last n characters.  Returns an empty string\nif n is greater than the length of s.",
   :name "butlast"}
  {:arglists ([s]),
   :name "capitalize",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L271",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/capitalize",
   :doc
   "Converts first character of the string to upper-case, all other\ncharacters to lower-case.",
   :var-type "function",
   :line 271,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "chomp",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L245",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/chomp",
   :doc
   "Removes all trailing newline \\n or return \\r characters from\nstring.  Note: String.trim() is similar and faster.\nDeprecated in 1.2. Use clojure.string/trim-newline",
   :var-type "function",
   :line 245,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L236",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/chop",
   :namespace "clojure.contrib.string",
   :line 236,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Removes the last character of string, does nothing on a zero-length\nstring.",
   :name "chop"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L78",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/codepoints",
   :namespace "clojure.contrib.string",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a sequence of integer Unicode code points in s.  Handles\nUnicode supplementary characters (above U+FFFF) correctly.",
   :name "codepoints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/dochars",
   :namespace "clojure.contrib.string",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "macro",
   :arglists ([bindings & body]),
   :doc
   "bindings => [name string]\n\nRepeatedly executes body, with name bound to each character in\nstring.  Does NOT handle Unicode supplementary characters (above\nU+FFFF).",
   :name "dochars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/docodepoints",
   :namespace "clojure.contrib.string",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "macro",
   :arglists ([bindings & body]),
   :doc
   "bindings => [name string]\n\nRepeatedly executes body, with name bound to the integer code point\nof each Unicode character in the string.  Handles Unicode\nsupplementary characters (above U+FFFF) correctly.",
   :name "docodepoints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L117",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/drop",
   :namespace "clojure.contrib.string",
   :line 117,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc
   "Drops first n characters from s.  Returns an empty string if n is\ngreater than the length of s.",
   :name "drop"}
  {:arglists ([cmap s]),
   :name "escape",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L91",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/escape",
   :doc
   "Returns a new String by applying cmap (a function or a map) to each\ncharacter in s.  If cmap returns nil, the original character is\nadded to the output unchanged.",
   :var-type "function",
   :line 91,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s i]),
   :name "get",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L377",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/get",
   :doc "Gets the i'th character in string.",
   :var-type "function",
   :line 377,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L309",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/grep",
   :namespace "clojure.contrib.string",
   :line 309,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([re coll]),
   :doc
   "Filters elements of coll by a regular expression.  The String\nrepresentation (with str) of each element is tested with re-find.",
   :name "grep"}
  {:arglists ([separator coll]),
   :name "join",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L229",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/join",
   :doc
   "Returns a string of all elements in coll, separated by\nseparator.  Like Perl's join.",
   :var-type "function",
   :line 229,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "lower-case",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L353",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/lower-case",
   :doc "Converts string to all lower-case.",
   :var-type "function",
   :line 353,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "ltrim",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L281",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/ltrim",
   :doc
   "Removes whitespace from the left side of string.\nDeprecated in 1.2. Use clojure.string/triml.",
   :var-type "function",
   :line 281,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L302",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/map-str",
   :namespace "clojure.contrib.string",
   :line 302,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([f coll]),
   :doc
   "Apply f to each element of coll, concatenate all results into a\nString.",
   :name "map-str"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L208",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/partition",
   :namespace "clojure.contrib.string",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([re s]),
   :doc
   "Splits the string into a lazy sequence of substrings, alternating\nbetween substrings that match the patthern and the substrings\nbetween the matches.  The sequence always starts with the substring\nbefore the first match, or an empty string if the beginning of the\nstring matches.\n\nFor example: (partition #\"[a-z]+\" \"abc123def\")\nreturns: (\"\" \"abc\" \"123\" \"def\")",
   :name "partition"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L140",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/repeat",
   :namespace "clojure.contrib.string",
   :line 140,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc "Returns a new String containing s repeated n times.",
   :name "repeat"}
  {:arglists ([re f s]),
   :name "replace-by",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L169",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-by",
   :doc
   "Replaces all matches of re in s with the result of \n(f (re-groups the-match)).",
   :var-type "function",
   :line 169,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([a b s]),
   :name "replace-char",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L157",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-char",
   :doc "Replaces all instances of character a with character b in s.",
   :var-type "function",
   :line 157,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([re f s]),
   :name "replace-first-by",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L195",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-first-by",
   :doc
   "Replace first match of re in s with the result of\n(f (re-groups the-match)).",
   :var-type "function",
   :line 195,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([re replacement s]),
   :name "replace-first-re",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L189",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-first-re",
   :doc "Replace first match of re in s.",
   :var-type "function",
   :line 189,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([a b s]),
   :name "replace-first-str",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L183",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-first-str",
   :doc "Replace first occurance of substring a with b in s.",
   :var-type "function",
   :line 183,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([re replacement s]),
   :name "replace-re",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L163",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-re",
   :doc "Replaces all matches of re with replacement in s.",
   :var-type "function",
   :line 163,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([a b s]),
   :name "replace-str",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L151",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/replace-str",
   :doc "Replaces all instances of substring a with b in s.",
   :var-type "function",
   :line 151,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "reverse",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L145",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/reverse",
   :doc "Returns s with its characters reversed.",
   :var-type "function",
   :line 145,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "rtrim",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L288",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/rtrim",
   :doc
   "Removes whitespace from the right side of string.\nDeprecated in 1.2. Use clojure.string/trimr.",
   :var-type "function",
   :line 288,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([re s] [re limit s]),
   :name "split",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L359",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/split",
   :doc
   "Splits string on a regular expression.  Optional argument limit is\nthe maximum number of splits.",
   :var-type "function",
   :line 359,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "split-lines",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L295",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/split-lines",
   :doc "Splits s on \\n or \\r\\n.",
   :var-type "function",
   :line 295,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L372",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/substring?",
   :namespace "clojure.contrib.string",
   :line 372,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([substring s]),
   :doc "True if s contains the substring.",
   :name "substring?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L253",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/swap-case",
   :namespace "clojure.contrib.string",
   :line 253,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Changes upper case characters to lower case and vice-versa.\nHandles Unicode supplementary characters correctly.  Uses the\nlocale-sensitive String.toUpperCase() and String.toLowerCase()\nmethods.",
   :name "swap-case"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L133",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/tail",
   :namespace "clojure.contrib.string",
   :line 133,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc "Returns the last n characters of s.",
   :name "tail"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L110",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/take",
   :namespace "clojure.contrib.string",
   :line 110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc "Take first n characters from s, up to the length of s.",
   :name "take"}
  {:arglists ([s]),
   :name "trim",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L366",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/trim",
   :doc "Removes whitespace from both ends of string.",
   :var-type "function",
   :line 366,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:arglists ([s]),
   :name "upper-case",
   :namespace "clojure.contrib.string",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/13f960559f724521070d761639310d8b1f503216/src/main/clojure/clojure/contrib/string.clj#L347",
   :deprecated "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//string-api.html#clojure.contrib.string/upper-case",
   :doc "Converts string to all upper-case.",
   :var-type "function",
   :line 347,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/string.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/62078f31f425a0bf4be6508a51ac1fa8ce09ea51/src/main/clojure/clojure/contrib/strint.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//strint-api.html#clojure.contrib.strint/<<",
   :namespace "clojure.contrib.strint",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/strint.clj",
   :var-type "macro",
   :arglists ([string]),
   :doc
   "Takes a single string argument and emits a str invocation that concatenates\nthe string data and evaluated expressions contained within that argument.\nEvaluation is controlled using ~{} and ~() forms.  The former is used for\nsimple value replacement using clojure.core/str; the latter can be used to\nembed the results of arbitrary function invocation into the produced string.\n\nExamples:\nuser=> (def v 30.5)\n#'user/v\nuser=> (<< \"This trial required ~{v}ml of solution.\")\n\"This trial required 30.5ml of solution.\"\nuser=> (<< \"There are ~(int v) days in November.\")\n\"There are 30 days in November.\"\nuser=> (def m {:a [1 2 3]})\n#'user/m\nuser=> (<< \"The total for your order is $~(->> m :a (apply +)).\")\n\"The total for your order is $6.\"\n\nNote that quotes surrounding string literals within ~() forms must be\nescaped.",
   :name "<<"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L70",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/action-translation-table",
   :namespace "clojure.contrib.swing-utils",
   :line 70,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "var",
   :doc "Translation table for the make-action constructor.",
   :name "action-translation-table"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L23",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/add-action-listener",
   :namespace "clojure.contrib.swing-utils",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "function",
   :arglists ([component f & args]),
   :doc
   "Adds an ActionLister to component. When the action fires, f will be\ninvoked with the event as its first argument followed by args.\nReturns the listener.",
   :name "add-action-listener"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/add-key-typed-listener",
   :namespace "clojure.contrib.swing-utils",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "function",
   :arglists ([component f & args]),
   :doc
   "Adds a KeyListener to component that only responds to KeyTyped events.\nWhen a key is typed, f is invoked with the KeyEvent as its first argument\nfollowed by args. Returns the listener.",
   :name "add-key-typed-listener"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L101",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/add-menu-item",
   :namespace "clojure.contrib.swing-utils",
   :line 101,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "multimethod",
   :arglists ([parent item]),
   :doc
   "Adds a menu item to the parent according to the item description.\n  The item description is a map of the following structure.\n\nEither:\n  - one single :action specifying a javax.swing.Action to be associated\n    with the item.\n  - a specification suitable for make-action\n  - a set of :name, :mnemonic and :items keys, specifying a submenu with\n    the given sequence of item entries.\n  - an empty map specifying a separator.",
   :name "add-menu-item"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L58",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing",
   :namespace "clojure.contrib.swing-utils",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Executes body in the Swing event thread asynchronously. Returns\nimmediately after scheduling the execution.",
   :name "do-swing"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing*",
   :namespace "clojure.contrib.swing-utils",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "function",
   :arglists ([schedule thunk]),
   :doc
   "Runs thunk in the Swing event thread according to schedule:\n- :later => schedule the execution and return immediately\n- :now   => wait until the execution completes.",
   :name "do-swing*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L64",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/do-swing-and-wait",
   :namespace "clojure.contrib.swing-utils",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Executes body in the Swing event thread synchronously. Returns\nafter the execution is complete.",
   :name "do-swing-and-wait"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L80",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/make-action",
   :namespace "clojure.contrib.swing-utils",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "function",
   :arglists ([spec]),
   :doc
   "Create an Action proxy from the given action spec. The standard keys\nrecognised are: :name, :accelerator, :command-key, :long-desc,\n:short-desc, :mnemonic and :icon - corresponding to the similar named\nAction properties.  The :handler value is used in the actionPerformed\nmethod of the proxy to pass on the event.",
   :name "make-action"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L142",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/make-menubar",
   :namespace "clojure.contrib.swing-utils",
   :line 142,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "function",
   :arglists ([menubar-items]),
   :doc
   "Create a menubar containing the given sequence of menu items. The menu\nitems are described by a map as is detailed in the docstring of the\nadd-menu-item function.",
   :name "make-menubar"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/swing_utils.clj#L97",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//swing-utils-api.html#clojure.contrib.swing-utils/menu-constructor-dispatch",
   :namespace "clojure.contrib.swing-utils",
   :line 97,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/swing_utils.clj",
   :var-type "var",
   :doc
   "An atom containing the dispatch set for the add-menu-item method.",
   :name "menu-constructor-dispatch"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L239",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/*load-tests*",
   :namespace "clojure.contrib.test-is",
   :added "1.1",
   :line 239,
   :file "clojure/test.clj",
   :var-type "var",
   :doc
   "True by default.  If set to false, no test functions will\nbe created by deftest, set-test, or with-test.  Use this to omit\ntests when compiling or loading production code.",
   :name "*load-tests*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/*stack-trace-depth*",
   :namespace "clojure.contrib.test-is",
   :added "1.1",
   :line 246,
   :file "clojure/test.clj",
   :var-type "var",
   :doc
   "The maximum depth of stack traces to print when an Exception\nis thrown during a test.  Defaults to nil, which means print the \ncomplete stack trace.",
   :name "*stack-trace-depth*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L77",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/apply-template",
   :namespace "clojure.contrib.test-is",
   :line 77,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([expr values]),
   :doc
   "Replaces _1, _2, _3, etc. in expr with corresponding elements of\nvalues.  Returns the modified expression.  For use in macros.",
   :name "apply-template"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L105",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/are",
   :namespace "clojure.contrib.test-is",
   :line 105,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "macro",
   :arglists ([expr & args]),
   :doc
   "Checks multiple assertions with a template expression.\nSee clojure.contrib.template/do-template for an explanation of\ntemplates.\n\nExample: (are (= _1 _2)  \n              2 (+ 1 1)\n              4 (* 2 2))\nExpands to: \n         (do (is (= 2 (+ 1 1)))\n             (is (= 4 (* 2 2))))\n\nNote: This breaks some reporting features, such as line numbers.",
   :name "are"}
  {:arglists ([msg form]),
   :name "assert-any",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L434",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/assert-any",
   :doc
   "Returns generic assertion code for any test, including macros, Java\nmethod calls, or isolated symbols.",
   :var-type "function",
   :line 434,
   :file "clojure/test.clj"}
  {:arglists ([msg form]),
   :name "assert-predicate",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L415",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/assert-predicate",
   :doc
   "Returns generic assertion code for any functional predicate.  The\n'expected' argument to 'report' will contains the original form, the\n'actual' argument will contain the form with all its sub-forms\nevaluated.  If the predicate returns false, the 'actual' form will\nbe wrapped in (not...).",
   :var-type "function",
   :line 415,
   :file "clojure/test.clj"}
  {:arglists ([f1 f2]),
   :name "compose-fixtures",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L660",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/compose-fixtures",
   :doc
   "Composes two fixture functions, creating a new fixture function\nthat combines their behavior.",
   :var-type "function",
   :line 660,
   :file "clojure/test.clj"}
  {:arglists ([name & body]),
   :name "deftest",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L593",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/deftest",
   :doc
   "Defines a test function with no arguments.  Test functions may call\nother tests, so tests may be composed.  If you compose tests, you\nshould also define a function named test-ns-hook; run-tests will\ncall test-ns-hook instead of testing all vars.\n\nNote: Actually, the test body goes in the :test metadata on the var,\nand the real function (the value of the var) calls test-var on\nitself.\n\nWhen *load-tests* is false, deftest is ignored.",
   :var-type "macro",
   :line 593,
   :file "clojure/test.clj"}
  {:arglists ([name & body]),
   :name "deftest-",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L610",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/deftest-",
   :doc "Like deftest but creates a private var.",
   :var-type "macro",
   :line 610,
   :file "clojure/test.clj"}
  {:arglists ([m]),
   :name "do-report",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L335",
   :added "1.2",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/do-report",
   :doc
   "Add file and line information to a test result and call report.\nIf you are writing a custom assert-expr method, call this function\nto pass test results to report.",
   :var-type "function",
   :line 335,
   :file "clojure/test.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/do-template",
   :namespace "clojure.contrib.test-is",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "macro",
   :arglists ([expr & args]),
   :doc
   "Repeatedly evaluates template expr (in a do block) using values in\nargs.  args are grouped by the number of holes in the template.\nExample: (do-template (check _1 _2) :a :b :c :d)\nexpands to (do (check :a :b) (check :c :d))",
   :name "do-template"}
  {:arglists ([n]),
   :name "file-position",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L276",
   :deprecated "1.2",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/file-position",
   :doc
   "Returns a vector [filename line-number] for the nth call up the\nstack.\n\nDeprecated in 1.2: The information needed for test reporting is\nnow on :file and :line keys in the result map.",
   :var-type "function",
   :line 276,
   :file "clojure/test.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L52",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/find-holes",
   :namespace "clojure.contrib.test-is",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Recursively finds all symbols starting with _ in form.",
   :name "find-holes"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L58",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/find-pure-exprs",
   :namespace "clojure.contrib.test-is",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([form]),
   :doc
   "Recursively finds all sub-expressions in form that do not contain\nany symbols starting with _",
   :name "find-pure-exprs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/find-symbols",
   :namespace "clojure.contrib.test-is",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Recursively finds all symbols in form.",
   :name "find-symbols"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L66",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/flatten-map",
   :namespace "clojure.contrib.test-is",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "Transforms a map into a vector like [key value key value].",
   :name "flatten-map"}
  {:arglists ([x]),
   :name "function?",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L403",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/function?",
   :doc
   "Returns true if argument is a function or a symbol that resolves to\na function (not a macro).",
   :var-type "function",
   :line 403,
   :file "clojure/test.clj"}
  {:arglists ([v]),
   :name "get-possibly-unbound-var",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L395",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/get-possibly-unbound-var",
   :doc "Like var-get but returns nil if the var is unbound.",
   :var-type "function",
   :line 395,
   :file "clojure/test.clj"}
  {:arglists ([name]),
   :name "inc-report-counter",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L308",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/inc-report-counter",
   :doc
   "Increments the named counter in *report-counters*, a ref to a map.\nDoes nothing if *report-counters* is nil.",
   :var-type "function",
   :line 308,
   :file "clojure/test.clj"}
  {:arglists ([form] [form msg]),
   :name "is",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L533",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/is",
   :doc
   "Generic assertion macro.  'form' is any predicate test.\n'msg' is an optional message to attach to the assertion.\n\nExample: (is (= 4 (+ 2 2)) \"Two plus two should be 4\")\n\nSpecial forms:\n\n(is (thrown? c body)) checks that an instance of c is thrown from\nbody, fails if not; then returns the thing thrown.\n\n(is (thrown-with-msg? c re body)) checks that an instance of c is\nthrown AND that the message on the exception matches (with\nre-find) the regular expression re.",
   :var-type "macro",
   :line 533,
   :file "clojure/test.clj"}
  {:arglists ([fixtures]),
   :name "join-fixtures",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L667",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/join-fixtures",
   :doc
   "Composes a collection of fixtures, in order.  Always returns a valid\nfixture function, even if the collection is empty.",
   :var-type "function",
   :line 667,
   :file "clojure/test.clj"}
  {:name "report",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L319",
   :dynamic true,
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/report",
   :doc
   "Generic reporting function, may be overridden to plug in\ndifferent report formats (e.g., TAP, JUnit).  Assertions such as\n'is' call 'report' to indicate results.  The argument given to\n'report' will be a map with a :type key.  See the documentation at\nthe top of test_is.clj for more information on the types of\narguments for 'report'.",
   :var-type "multimethod",
   :line 319,
   :file "clojure/test.clj"}
  {:arglists ([] [re]),
   :name "run-all-tests",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L743",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/run-all-tests",
   :doc
   "Runs all tests in all namespaces; prints results.\nOptional argument is a regular expression; only namespaces with\nnames matching the regular expression (with re-matches) will be\ntested.",
   :var-type "function",
   :line 743,
   :file "clojure/test.clj"}
  {:arglists ([] [& namespaces]),
   :name "run-tests",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L731",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/run-tests",
   :doc
   "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given.  Returns a map\nsummarizing test results.",
   :var-type "function",
   :line 731,
   :file "clojure/test.clj"}
  {:arglists ([name & body]),
   :name "set-test",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L619",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/set-test",
   :doc
   "Experimental.\nSets :test metadata of the named var to a fn with the given body.\nThe var must already exist.  Does not modify the value of the var.\n\nWhen *load-tests* is false, set-test is ignored.",
   :var-type "macro",
   :line 619,
   :file "clojure/test.clj"}
  {:arglists ([summary]),
   :name "successful?",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L752",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/successful?",
   :doc
   "Returns true if the given test summary indicates all tests\nwere successful, false otherwise.",
   :var-type "function",
   :line 752,
   :file "clojure/test.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/25d3316706bfbaa75498b4d0bca8f696a328fb3d/src/main/clojure/clojure/contrib/test_is.clj#L72",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/template?",
   :namespace "clojure.contrib.test-is",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/test_is.clj",
   :var-type "function",
   :arglists ([form]),
   :doc "Returns true if form is a valid template expression.",
   :name "template?"}
  {:arglists ([ns]),
   :name "test-all-vars",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L694",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/test-all-vars",
   :doc
   "Calls test-var on every var interned in the namespace, with fixtures.",
   :var-type "function",
   :line 694,
   :file "clojure/test.clj"}
  {:arglists ([ns]),
   :name "test-ns",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L706",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/test-ns",
   :doc
   "If the namespace defines a function named test-ns-hook, calls that.\nOtherwise, calls test-all-vars on the namespace.  'ns' is a\nnamespace object or a symbol.\n\nInternally binds *report-counters* to a ref initialized to\n*inital-report-counters*.  Returns the final, dereferenced state of\n*report-counters*.",
   :var-type "function",
   :line 706,
   :file "clojure/test.clj"}
  {:arglists ([v]),
   :name "test-var",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L679",
   :dynamic true,
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/test-var",
   :doc
   "If v has a function in its :test metadata, calls that function,\nwith *testing-vars* bound to (conj *testing-vars* v).",
   :var-type "function",
   :line 679,
   :file "clojure/test.clj"}
  {:arglists ([string & body]),
   :name "testing",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L568",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/testing",
   :doc
   "Adds a new string to the list of testing contexts.  May be nested,\nbut must occur inside a test function (deftest).",
   :var-type "macro",
   :line 568,
   :file "clojure/test.clj"}
  {:arglists ([]),
   :name "testing-contexts-str",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L301",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/testing-contexts-str",
   :doc
   "Returns a string representation of the current test context. Joins\nstrings in *testing-contexts* with spaces.",
   :var-type "function",
   :line 301,
   :file "clojure/test.clj"}
  {:arglists ([m]),
   :name "testing-vars-str",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L288",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/testing-vars-str",
   :doc
   "Returns a string representation of the current test.  Renders names\nin *testing-vars* as a list, then the source file and line of\ncurrent assertion.",
   :var-type "function",
   :line 288,
   :file "clojure/test.clj"}
  {:arglists ([msg form]),
   :name "try-expr",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L517",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/try-expr",
   :doc
   "Used by the 'is' macro to catch unexpected exceptions.\nYou don't call this.",
   :var-type "macro",
   :line 517,
   :file "clojure/test.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L641",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/use-fixtures",
   :namespace "clojure.contrib.test-is",
   :added "1.1",
   :line 641,
   :file "clojure/test.clj",
   :var-type "multimethod",
   :doc
   "Wrap test runs in a fixture function to perform setup and\nteardown. Using a fixture-type of :each wraps every test\nindividually, while:once wraps the whole run in a single function.",
   :name "use-fixtures"}
  {:arglists ([definition & body]),
   :name "with-test",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L580",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/with-test",
   :doc
   "Takes any definition form (that returns a Var) as the first argument.\nRemaining body goes in the :test metadata function for that Var.\n\nWhen *load-tests* is false, only evaluates the definition, ignoring\nthe tests.",
   :var-type "macro",
   :line 580,
   :file "clojure/test.clj"}
  {:arglists ([& body]),
   :name "with-test-out",
   :namespace "clojure.contrib.test-is",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob//src/main/clojure/clojure/test.clj#L267",
   :added "1.1",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//test-is-api.html#clojure.contrib.test-is/with-test-out",
   :doc "Runs body with *out* bound to the value of *test-out*.",
   :var-type "macro",
   :line 267,
   :file "clojure/test.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L40",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/*trace-depth*",
   :namespace "clojure.contrib.trace",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "var",
   :doc "Current stack depth of traced function calls.",
   :name "*trace-depth*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L75",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/deftrace",
   :namespace "clojure.contrib.trace",
   :line 75,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "macro",
   :arglists ([name & definition]),
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments.  Nested calls to deftrace'd functions will print a\ntree-like structure.",
   :name "deftrace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L86",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/dotrace",
   :namespace "clojure.contrib.trace",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "macro",
   :arglists ([fnames & exprs]),
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions.  Does not work on inlined functions,\nsuch as clojure.core/+",
   :name "dotrace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L50",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace",
   :namespace "clojure.contrib.trace",
   :line 50,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "function",
   :arglists ([value] [name value]),
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value.  May be wrapped around any expression without\naffecting the result.",
   :name "trace"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L64",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace-fn-call",
   :namespace "clojure.contrib.trace",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "function",
   :arglists ([name f args]),
   :doc
   "Traces a single call to a function f with args.  'name' is the\nsymbol name of the function.",
   :name "trace-fn-call"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/trace-indent",
   :namespace "clojure.contrib.trace",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns an indentation string based on *trace-depth*",
   :name "trace-indent"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/trace.clj#L44",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//trace-api.html#clojure.contrib.trace/tracer",
   :namespace "clojure.contrib.trace",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/trace.clj",
   :var-type "function",
   :arglists ([name value]),
   :doc
   "This function is called by trace.  Prints to standard output, but\nmay be rebound to do anything you like.  'name' is optional.",
   :name "tracer"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/types.clj#L128",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/defadt",
   :namespace "clojure.contrib.types",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/types.clj",
   :var-type "macro",
   :arglists ([type-tag & constructors]),
   :doc
   "Define an algebraic data type name by an exhaustive list of constructors.\nEach constructor can be a symbol (argument-free constructor) or a\nlist consisting of a tag symbol followed by the argument symbols.\nThe data type tag must be a keyword.",
   :name "defadt"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/types.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/deftype",
   :namespace "clojure.contrib.types",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/types.clj",
   :var-type "macro",
   :arglists
   ([type-tag constructor-name docstring? attr-map?]
    [type-tag constructor-name docstring? attr-map? constructor]
    [type-tag
     constructor-name
     docstring?
     attr-map?
     constructor
     deconstructor]),
   :doc
   "Define a data type by a type tag (a namespace-qualified keyword)\nand a symbol naming the constructor function. Optionally, a\nconstructor and a deconstructor function can be given as well,\nthe defaults being clojure.core/identity and clojure.core/list.\nThe full constructor associated with constructor-name calls the\nconstructor function and attaches the type tag to its result\nas metadata. The deconstructor function must return the arguments\nto be passed to the constructor in order to create an equivalent\nobject. It is used for printing and matching.",
   :name "deftype"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/types.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/deftype-",
   :namespace "clojure.contrib.types",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/types.clj",
   :var-type "macro",
   :arglists ([type-tag constructor-name & optional]),
   :doc "Same as deftype but the constructor is private.",
   :name "deftype-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/types.clj#L241",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//types-api.html#clojure.contrib.types/match",
   :namespace "clojure.contrib.types",
   :line 241,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/types.clj",
   :var-type "macro",
   :arglists ([value & clauses]),
   :doc
   "Given a value and a list of template-expr clauses, evaluate the first\nexpr whose template matches the value. There are four kinds of templates:\n1) Lists of the form (tag x1 x2 ...) match instances of types\n   whose constructor has the same form as the list.\n2) Quoted lists of the form '(x1 x2 ...) match lists of the same\n   length.\n3) Vectors of the form [x1 x2 ...] match vectors of the same length.\n4) Maps of the form {:key1 x1 :key2 x2 ...} match maps that have\n   the same keys as the template, but which can have additional keys\n   that are not part of the template.\nThe values x1, x2, ... can be symbols or non-symbol values. Non-symbols\nmust be equal to the corresponding values in the object to be matched.\nSymbols will be bound to the corresponding value in the object in the\nevaluation of expr. If the same symbol occurs more than once in a,\ntemplate the corresponding elements of the object must be equal\nfor the template to match.",
   :name "match"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/with_ns.clj#L20",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//with-ns-api.html#clojure.contrib.with-ns/with-ns",
   :namespace "clojure.contrib.with-ns",
   :line 20,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/with_ns.clj",
   :var-type "macro",
   :arglists ([ns & body]),
   :doc
   "Evaluates body in another namespace.  ns is either a namespace\nobject or a symbol.  This makes it possible to define functions in\nnamespaces other than the current one.",
   :name "with-ns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/with_ns.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//with-ns-api.html#clojure.contrib.with-ns/with-temp-ns",
   :namespace "clojure.contrib.with-ns",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/with_ns.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Evaluates body in an anonymous namespace, which is then immediately\nremoved.  The temporary namespace will 'refer' clojure.core.",
   :name "with-temp-ns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L65",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/ancestors",
   :namespace "clojure.contrib.zip-filter",
   :line 65,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all ancestors of location loc, starting\nwith loc and proceeding to loc's parent node and on through to the\nroot of the tree.",
   :name "ancestors"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L45",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/children",
   :namespace "clojure.contrib.zip-filter",
   :line 45,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right.",
   :name "children"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L52",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/children-auto",
   :namespace "clojure.contrib.zip-filter",
   :line 52,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right, marked so that a following tag= predicate will auto-descend.",
   :name "children-auto"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L60",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/descendants",
   :namespace "clojure.contrib.zip-filter",
   :line 60,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all descendants of location loc, in\ndepth-first order, left-to-right, starting with loc.",
   :name "descendants"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/left-locs",
   :namespace "clojure.contrib.zip-filter",
   :line 33,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of locations to the left of loc, starting with loc.",
   :name "left-locs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L37",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/leftmost?",
   :namespace "clojure.contrib.zip-filter",
   :line 37,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns true if there are no more nodes to the left of location loc.",
   :name "leftmost?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L29",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/right-locs",
   :namespace "clojure.contrib.zip-filter",
   :line 29,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of locations to the right of loc, starting with loc.",
   :name "right-locs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter.clj#L41",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter/rightmost?",
   :namespace "clojure.contrib.zip-filter",
   :line 41,
   :file "clojure/contrib/zip_filter.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns true if there are no more nodes to the right of location loc.",
   :name "rightmost?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/condition/Condition.clj#L25",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-init",
   :namespace "clojure.contrib.condition.Condition",
   :line 25,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :var-type "function",
   :arglists ([condition]),
   :doc
   "Constructs a Condition object with condition (a map) as its\nmetadata. Also initializes the superclass with the values at :message\nand :cause, if any, so they are also available via .getMessage and\n.getCause.",
   :name "-init"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/condition/Condition.clj#L40",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-meta",
   :namespace "clojure.contrib.condition.Condition",
   :line 40,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :var-type "function",
   :arglists ([this]),
   :doc "Returns this object's metadata, the condition",
   :name "-meta"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/condition/Condition.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//condition-api.html#clojure.contrib.condition.Condition/-post-init",
   :namespace "clojure.contrib.condition.Condition",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/condition/Condition.clj",
   :var-type "function",
   :arglists ([this condition]),
   :doc
   "Adds :stack-trace to the condition. Drops the bottom 3 frames because\nthey are always the same: implementation details of Condition and raise.",
   :name "-post-init"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L86",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-index",
   :namespace "clojure.contrib.datalog.database",
   :line 86,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db name key]),
   :doc "Adds an index to an empty relation named name",
   :name "add-index"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L81",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-relation",
   :namespace "clojure.contrib.datalog.database",
   :line 81,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db name keys]),
   :doc "Adds a relation to the database",
   :name "add-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L172",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-tuple",
   :namespace "clojure.contrib.datalog.database",
   :line 172,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rel-name tuple] [rel tuple]),
   :doc
   "Two forms:\n\n[db relation-name tuple] adds tuple to the named relation.  Returns\nthe new database.\n\n[rel tuple] adds to the relation object.  Returns the new relation.",
   :name "add-tuple"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L207",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/add-tuples",
   :namespace "clojure.contrib.datalog.database",
   :line 207,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db & tupls]),
   :doc
   "Adds a collection of tuples to the db, as\n(add-tuples db\n   [:rel-name :key-1 1 :key-2 2]\n   [:rel-name :key-1 2 :key-2 3])",
   :name "add-tuples"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L253",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/any-match?",
   :namespace "clojure.contrib.datalog.database",
   :line 253,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rn pt]),
   :doc
   "Finds if there are any matching records for the partial tuple",
   :name "any-match?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L144",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-counts",
   :namespace "clojure.contrib.datalog.database",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db]),
   :doc "Returns a map with the count of elements in each relation.",
   :name "database-counts"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L277",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-merge",
   :namespace "clojure.contrib.datalog.database",
   :line 277,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([dbs]),
   :doc "Merges databases together",
   :name "database-merge"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L282",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/database-merge-parallel",
   :namespace "clojure.contrib.datalog.database",
   :line 282,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([dbs]),
   :doc "Merges databases together in parallel",
   :name "database-merge-parallel"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L76",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/datalog-relation",
   :namespace "clojure.contrib.datalog.database",
   :line 76,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([schema data indexes]),
   :doc "Creates a relation",
   :name "datalog-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L96",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/ensure-relation",
   :namespace "clojure.contrib.datalog.database",
   :line 96,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db name keys indexes]),
   :doc "If the database lacks the named relation, add it",
   :name "ensure-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L130",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/get-relation",
   :namespace "clojure.contrib.datalog.database",
   :line 130,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rel-name]),
   :doc "Get a relation object by name",
   :name "get-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L109",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/make-database",
   :namespace "clojure.contrib.datalog.database",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "macro",
   :arglists ([& commands]),
   :doc
   "Makes a database, like this\n(make-database\n  (relation :fred [:mary :sue])\n  (index :fred :mary)\n  (relation :sally [:jen :becky])\n  (index :sally :jen)\n  (index :sally :becky))",
   :name "make-database"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L267",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/merge-relations",
   :namespace "clojure.contrib.datalog.database",
   :line 267,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([r1 r2]),
   :doc "Merges two relations",
   :name "merge-relations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L190",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/remove-tuple",
   :namespace "clojure.contrib.datalog.database",
   :line 190,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rel-name tuple] [rel tuple]),
   :doc
   "Two forms:\n\n[db relation-name tuple] removes the tuple from the named relation,\nreturns a new database.\n\n[rel tuple] removes the tuple from the relation.  Returns the new\nrelation.",
   :name "remove-tuple"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L135",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/replace-relation",
   :namespace "clojure.contrib.datalog.database",
   :line 135,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rel-name rel]),
   :doc
   "Add or replace a fully constructed relation object to the database.",
   :name "replace-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/database.clj#L248",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.database/select",
   :namespace "clojure.contrib.datalog.database",
   :line 248,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/database.clj",
   :var-type "function",
   :arglists ([db rn pt]),
   :doc
   "finds all matching tuples to the partial tuple (pt) in the relation named (rn)",
   :name "select"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L253",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/adorned-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 253,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc
   "When passed a set of bound columns, returns the adorned literal",
   :name "adorned-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L132",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/build-atom",
   :namespace "clojure.contrib.datalog.literals",
   :line 132,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([f type]),
   :doc
   "Returns an unevaluated expression (to be used in a macro) of an\natom.",
   :name "build-atom"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L127",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/build-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 127,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc
   "(Returns an unevaluated expression (to be used in macros) of a\nliteral.",
   :name "build-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L302",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/build-seed-bindings",
   :namespace "clojure.contrib.datalog.literals",
   :line 302,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Given a seed literal, already adorned and in magic form, convert\nits bound constants to new variables.",
   :name "build-seed-bindings"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L319",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/delta-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 319,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([l]),
   :doc "Given a literal l, return a delta version",
   :name "delta-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L163",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/display-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 163,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Converts a struct representing a literal to a normal list",
   :name "display-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L270",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-adorned-bindings",
   :namespace "clojure.contrib.datalog.literals",
   :line 270,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([pred]),
   :doc "Get the bindings from this adorned literal.",
   :name "get-adorned-bindings"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L275",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-base-predicate",
   :namespace "clojure.contrib.datalog.literals",
   :line 275,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([pred]),
   :doc "Get the base predicate from this predicate.",
   :name "get-base-predicate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L201",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-cs-from-vs",
   :namespace "clojure.contrib.datalog.literals",
   :line 201,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "From a set of vars, get the columns",
   :name "get-cs-from-vs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L218",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-self-bound-cs",
   :namespace "clojure.contrib.datalog.literals",
   :line 218,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Get the columns that are bound withing the literal.",
   :name "get-self-bound-cs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L186",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/get-vs-from-cs",
   :namespace "clojure.contrib.datalog.literals",
   :line 186,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "From a set of columns, return the vars",
   :name "get-vs-from-cs"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L360",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/join-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 360,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc
   "Given a database (db), a literal (lit) and a seq of bindings (bs),\nreturn a new seq of bindings by joining this literal.",
   :name "join-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L235",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-appropriate?",
   :namespace "clojure.contrib.datalog.literals",
   :line 235,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc
   "When passed a set of bound vars, determines if this literal can be\nused during this point of a SIP computation.",
   :name "literal-appropriate?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-columns",
   :namespace "clojure.contrib.datalog.literals",
   :line 47,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Return the column names this applies to",
   :name "literal-columns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L295",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-magic?",
   :namespace "clojure.contrib.datalog.literals",
   :line 295,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([lit]),
   :doc "Is this literal magic?",
   :name "literal-magic?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L43",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-predicate",
   :namespace "clojure.contrib.datalog.literals",
   :line 43,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Return the predicate/relation this conditional operates over",
   :name "literal-predicate"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/literal-vars",
   :namespace "clojure.contrib.datalog.literals",
   :line 51,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Returns the logic vars used by this literal",
   :name "literal-vars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L285",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/magic-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 285,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([l]),
   :doc "Create a magic version of this adorned predicate.",
   :name "magic-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L313",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/negated-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 313,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([l]),
   :doc "Given a literal l, return a negated version",
   :name "negated-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L111",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/negated?",
   :namespace "clojure.contrib.datalog.literals",
   :line 111,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([l]),
   :doc "Is this literal a negated literal?",
   :name "negated?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/negative-vars",
   :namespace "clojure.contrib.datalog.literals",
   :line 59,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Returns the logic vars used in a negative position",
   :name "negative-vars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L55",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/positive-vars",
   :namespace "clojure.contrib.datalog.literals",
   :line 55,
   :file "clojure/contrib/datalog/literals.clj",
   :var-type "multimethod",
   :doc "Returns the logic vars used in a positive position",
   :name "positive-vars"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/positive?",
   :namespace "clojure.contrib.datalog.literals",
   :line 116,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([l]),
   :doc "Is this a positive literal?",
   :name "positive?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/78ee9b3e64c5ac6082fb223fc79292175e8e4f0c/src/main/clojure/clojure/contrib/datalog/literals.clj#L392",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.literals/project-literal",
   :namespace "clojure.contrib.datalog.literals",
   :line 392,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/literals.clj",
   :var-type "function",
   :arglists ([db lit bs] [db lit bs var?]),
   :doc
   "Project a stream of bindings onto a literal/relation. Returns a new\ndb.",
   :name "project-literal"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L26",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/adorn-query",
   :namespace "clojure.contrib.datalog.magic",
   :line 26,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([q]),
   :doc "Adorn a query",
   :name "adorn-query"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L31",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/adorn-rules-set",
   :namespace "clojure.contrib.datalog.magic",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([rs q]),
   :doc
   "Adorns the given rules-set for the given query.  (rs) is a\nrules-set, (q) is an adorned query.",
   :name "adorn-rules-set"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L78",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/build-partial-tuple",
   :namespace "clojure.contrib.datalog.magic",
   :line 78,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([q bindings]),
   :doc
   "Given a query and a set of bindings, build a partial tuple needed\nto extract the relation from the database.",
   :name "build-partial-tuple"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L98",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/magic-transform",
   :namespace "clojure.contrib.datalog.magic",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([rs] [rs i-preds]),
   :doc
   "Return a magic transformation of an adorned rules-set (rs).  The\n(i-preds) are the predicates of the intension database.  These\ndefault to the predicates within the rules-set.",
   :name "magic-transform"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L90",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-predicate-for-insertion",
   :namespace "clojure.contrib.datalog.magic",
   :line 90,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([q]),
   :doc
   "Given a query, return the predicate to use for database insertion.",
   :name "seed-predicate-for-insertion"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L63",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-relation",
   :namespace "clojure.contrib.datalog.magic",
   :line 63,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([q]),
   :doc
   "Given a magic form of a query, give back the literal form of its seed\nrelation",
   :name "seed-relation"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/datalog/magic.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.magic/seed-rule",
   :namespace "clojure.contrib.datalog.magic",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/magic.clj",
   :var-type "function",
   :arglists ([q]),
   :doc "Given an adorned query, give back its seed rule",
   :name "seed-rule"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L67",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/<-",
   :namespace "clojure.contrib.datalog.rules",
   :line 67,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "macro",
   :arglists ([hd & body]),
   :doc
   "Build a datalog rule.  Like this:\n\n(<- (:head :x ?x :y ?y) (:body-1 :x ?x :y ?y) (:body-2 :z ?z) (not! :body-3 :x ?x) (if > ?y ?z))",
   :name "<-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L85",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/?-",
   :namespace "clojure.contrib.datalog.rules",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "macro",
   :arglists ([& q]),
   :doc "Define a datalog query",
   :name "?-"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L162",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/all-predicates",
   :namespace "clojure.contrib.datalog.rules",
   :line 162,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rs]),
   :doc "Given a rules-set, return all defined predicates",
   :name "all-predicates"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L183",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/apply-rule",
   :namespace "clojure.contrib.datalog.rules",
   :line 183,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([db rule] [db-1 db-2 rule]),
   :doc
   "Apply the rule against db-1, adding the results to the appropriate\nrelation in db-2.  The relation will be created if needed.",
   :name "apply-rule"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L99",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/compute-sip",
   :namespace "clojure.contrib.datalog.rules",
   :line 99,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([bindings i-preds rule]),
   :doc
   "Given a set of bound column names, return an adorned sip for this\nrule.  A set of intensional predicates should be provided to\ndetermine what should be adorned.",
   :name "compute-sip"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/display-query",
   :namespace "clojure.contrib.datalog.rules",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([query]),
   :doc "Return a query in a readable format.",
   :name "display-query"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L31",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/display-rule",
   :namespace "clojure.contrib.datalog.rules",
   :line 31,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rule]),
   :doc "Return the rule in a readable format.",
   :name "display-rule"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/is-safe?",
   :namespace "clojure.contrib.datalog.rules",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rule]),
   :doc "Is the rule safe according to the datalog protocol?",
   :name "is-safe?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L128",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/make-rules-set",
   :namespace "clojure.contrib.datalog.rules",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rs]),
   :doc
   "Given an existing set of rules, make it a 'rules-set' for\nprinting.",
   :name "make-rules-set"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L167",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/non-base-rules",
   :namespace "clojure.contrib.datalog.rules",
   :line 167,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rs]),
   :doc
   "Return a collection of rules that depend, somehow, on other rules",
   :name "non-base-rules"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L152",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/predicate-map",
   :namespace "clojure.contrib.datalog.rules",
   :line 152,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rs]),
   :doc
   "Given a rules-set, return a map of rules keyed by their predicates.\nEach value will be a set of rules.",
   :name "predicate-map"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L80",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/return-rule-data",
   :namespace "clojure.contrib.datalog.rules",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([rule]),
   :doc "Returns an untypted rule that will be fully printed",
   :name "return-rule-data"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/datalog/rules.clj#L136",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.rules/rules-set",
   :namespace "clojure.contrib.datalog.rules",
   :line 136,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/rules.clj",
   :var-type "function",
   :arglists ([& rules]),
   :doc "Given a collection of rules return a rules set",
   :name "rules-set"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/softstrat.clj#L115",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.softstrat/build-soft-strat-work-plan",
   :namespace "clojure.contrib.datalog.softstrat",
   :line 115,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/softstrat.clj",
   :var-type "function",
   :arglists ([rs q]),
   :doc "Return a work plan for the given rules-set and query",
   :name "build-soft-strat-work-plan"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/softstrat.clj#L121",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.softstrat/get-all-relations",
   :namespace "clojure.contrib.datalog.softstrat",
   :line 121,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/softstrat.clj",
   :var-type "function",
   :arglists ([ws]),
   :doc "Return a set of all relation names defined in this workplan",
   :name "get-all-relations"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/is-query-var?",
   :namespace "clojure.contrib.datalog.util",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([sym]),
   :doc "Is this a query variable: e.g. a symbol prefixed with ??",
   :name "is-query-var?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L25",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/is-var?",
   :namespace "clojure.contrib.datalog.util",
   :line 25,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([sym]),
   :doc "Is this a logic variable: e.g. a symbol prefixed with a ?",
   :name "is-var?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L49",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/keys-to-vals",
   :namespace "clojure.contrib.datalog.util",
   :line 49,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([m ks]),
   :doc
   "Given a map and a collection of keys, return the collection of vals",
   :name "keys-to-vals"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L41",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/map-values",
   :namespace "clojure.contrib.datalog.util",
   :line 41,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([f hash]),
   :doc "Like map, but works over the values of a hash map",
   :name "map-values"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L62",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/preduce",
   :namespace "clojure.contrib.datalog.util",
   :line 62,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([f data]),
   :doc
   "Similar to merge-with, but the contents of each key are merged in\nparallel using f.\n\nf - a function of 2 arguments.\ndata - a collection of hashes.",
   :name "preduce"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L54",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/reverse-map",
   :namespace "clojure.contrib.datalog.util",
   :line 54,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "Reverse the keys/values of a map",
   :name "reverse-map"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/ec6a7579d6b1c0bfa42e3666cfad196cffc966fe/src/main/clojure/clojure/contrib/datalog/util.clj#L82",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//datalog-api.html#clojure.contrib.datalog.util/trace-datalog",
   :namespace "clojure.contrib.datalog.util",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/datalog/util.clj",
   :var-type "macro",
   :arglists ([& body]),
   :doc "If *test-datalog* is set to true, run the enclosed commands",
   :name "trace-datalog"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L94",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/add-components",
   :namespace "clojure.contrib.miglayout.internal",
   :line 94,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([container components]),
   :doc "Adds components with constraints to a container",
   :name "add-components"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L59",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/component?",
   :namespace "clojure.contrib.miglayout.internal",
   :line 59,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns true if x is a java.awt.Component",
   :name "component?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L64",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/constraint?",
   :namespace "clojure.contrib.miglayout.internal",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns true if x is not a keyword-item or component",
   :name "constraint?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L114",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/do-layout",
   :namespace "clojure.contrib.miglayout.internal",
   :line 114,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([container layout column row components]),
   :doc
   "Attaches a MigLayout layout manager to container and adds components\nwith constraints",
   :name "do-layout"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L32",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/format-constraint",
   :namespace "clojure.contrib.miglayout.internal",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([c]),
   :doc
   "Returns a vector of vectors representing one or more constraints\nseparated by commas. Constraints may be specified in Clojure using\nstrings, keywords, vectors, maps, and/or sets.",
   :name "format-constraint"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L47",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/format-constraints",
   :namespace "clojure.contrib.miglayout.internal",
   :line 47,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([& constraints]),
   :doc
   "Returns a string representing all the constraints for one keyword-item\nor component formatted for miglayout.",
   :name "format-constraints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L109",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/get-components",
   :namespace "clojure.contrib.miglayout.internal",
   :line 109,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([container]),
   :doc
   "Returns a map from id to component for all components with an id",
   :name "get-components"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L88",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/parse-component-constraint",
   :namespace "clojure.contrib.miglayout.internal",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([constraint]),
   :doc "Parses a component constraint string returning a CC object",
   :name "parse-component-constraint"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/miglayout/internal.clj#L71",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//miglayout-api.html#clojure.contrib.miglayout.internal/parse-item-constraints",
   :namespace "clojure.contrib.miglayout.internal",
   :line 71,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/miglayout/internal.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Iterates over args and builds a map containing values associated with\n:keywords and :components. The value for :keywords is a map from keyword\nitems to constraints strings. The value for :components is a vector of\nvectors each associating a component with its constraints string.",
   :name "parse-item-constraints"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L216",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/calls",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 216,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([val] [val expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :calls key with a\nfunction that will be called with the given arguments. The return value from\nthis function will be returned returned by the expected function. If both this\nand returns are specified, the return value of \"calls\" will have precedence.\nUsage:\n(calls some-fn expectation-hash?)",
   :name "calls"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L228",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/has-args",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 228,
   :file "clojure/contrib/mock.clj",
   :var-type "macro",
   :arglists ([arg-pred-forms] [arg-pred-forms expect-hash-form]),
   :doc
   "Creates or associates to an existing expectation hash the :has-args key with\na value corresponding to a function that will either return true if its\nargument expectations are met or throw an exception with the details of the\nfirst failed argument it encounters.\nOnly specify as many predicates as you are interested in verifying. The rest\nof the values are safely ignored.\nUsage:\n(has-args [arg-pred-1 arg-pred-2 ... arg-pred-n] expectation-hash?)",
   :name "has-args"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L105",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/has-matching-signature?",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 105,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([fn-name args]),
   :doc
   "Calls no-matching-function-signature if no match is found for the given\nfunction. If no argslist meta data is available for the function, it is\nnot called.",
   :name "has-matching-signature?"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L116",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-arg-checker",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 116,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([arg-preds arg-pred-forms]),
   :doc
   "Creates the argument verifying function for a replaced dependency within\nthe expectation bound scope. These functions take the additional argument\nof the name of the replaced function, then the rest of their args. It is\ndesigned to be called from the mock function generated in the first argument\nof the mock info object created by make-mock.",
   :name "make-arg-checker"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L131",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-count-checker",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 131,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([pred pred-form]),
   :doc
   "creates the count checker that is invoked at the end of an expectation, after\nthe code under test has all been executed. The function returned takes the\nname of the associated dependency and the invocation count as arguments.",
   :name "make-count-checker"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L150",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/make-mock",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 150,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([fn-name expectation-hash]),
   :doc
   "creates a vector containing the following information for the named function:\n1. dependent function replacement - verifies signature, calls arg checker,\nincreases count, returns return value.\n2. an atom containing the invocation count\n3. the invocation count checker function\n4. a symbol of the name of the function being replaced.",
   :name "make-mock"}
  {:arglists ([fn-name expected actual msg]),
   :name "report-problem",
   :namespace "clojure.contrib.mock.test-adapter",
   :source-url
   "http://github.com/clojure/clojure-contrib/blob/2ede388a9267d175bfaa7781ee9d57532eb4f20f/src/main/clojure/clojure/contrib/mock/test_adapter.clj#L19",
   :dynamic true,
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/report-problem",
   :doc
   "This function is designed to be used in a binding macro to override\nthe report-problem function in clojure.contrib.mock. Instead of printing\nthe error to the console, the error is logged via clojure.test.",
   :var-type "function",
   :line 19,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/mock/test_adapter.clj"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L205",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/returns",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 205,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([val] [val expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :returns key with\na value to be returned by the expectation after a successful invocation\nmatching its expected arguments (if applicable).\nUsage:\n(returns ret-value expectation-hash?)",
   :name "returns"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L246",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/times",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 246,
   :file "clojure/contrib/mock.clj",
   :var-type "macro",
   :arglists ([times-fn] [times-fn expectation-hash]),
   :doc
   "Creates or associates to an existing expectation hash the :times key with a\nvalue corresponding to a predicate function which expects an integer value.\nThis function can either be specified as the first argument to times or can be\nthe result of calling times with an integer argument, in which case the\npredicate will default to being an exact match.  This predicate is called at\nthe end of an expect expression to validate that an expected dependency\nfunction was called the expected number of times.\nUsage:\n(times n)\n(times #(> n %))\n(times n expectation-hash)",
   :name "times"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/mock.clj#L175",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//mock-api.html#clojure.contrib.mock.test-adapter/validate-counts",
   :namespace "clojure.contrib.mock.test-adapter",
   :line 175,
   :file "clojure/contrib/mock.clj",
   :var-type "function",
   :arglists ([mock-data]),
   :doc
   "given the sequence of all mock data for the expectation, simply calls the\ncount checker for each dependency.",
   :name "validate-counts"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/connection*",
   :namespace "clojure.contrib.sql.internal",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns the current database connection (or throws if there is none)",
   :name "connection*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L33",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/find-connection*",
   :namespace "clojure.contrib.sql.internal",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns the current database connection (or nil if there is none)",
   :name "find-connection*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/get-connection",
   :namespace "clojure.contrib.sql.internal",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists
   ([{:keys
      [factory
       classname
       subprotocol
       subname
       datasource
       username
       password
       name
       environment],
      :as db-spec}]),
   :doc
   "Creates a connection to a database. db-spec is a map containing values\nfor one of the following parameter sets:\n\nFactory:\n  :factory     (required) a function of one argument, a map of params\n  (others)     (optional) passed to the factory function in a map\n\nDriverManager:\n  :classname   (required) a String, the jdbc driver class name\n  :subprotocol (required) a String, the jdbc subprotocol\n  :subname     (required) a String, the jdbc subname\n  (others)     (optional) passed to the driver as properties.\n\nDataSource:\n  :datasource  (required) a javax.sql.DataSource\n  :username    (optional) a String\n  :password    (optional) a String, required if :username is supplied\n\nJNDI:\n  :name        (required) a String or javax.naming.Name\n  :environment (optional) a java.util.Map",
   :name "get-connection"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L107",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-sql-exception",
   :namespace "clojure.contrib.sql.internal",
   :line 107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([stream exception]),
   :doc "Prints the contents of an SQLException to stream",
   :name "print-sql-exception"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L121",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-sql-exception-chain",
   :namespace "clojure.contrib.sql.internal",
   :line 121,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([stream exception]),
   :doc "Prints a chain of SQLExceptions to stream",
   :name "print-sql-exception-chain"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L129",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/print-update-counts",
   :namespace "clojure.contrib.sql.internal",
   :line 129,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([stream exception]),
   :doc
   "Prints the update counts from a BatchUpdateException to stream",
   :name "print-update-counts"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L44",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/rollback",
   :namespace "clojure.contrib.sql.internal",
   :line 44,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([] [val]),
   :doc "Accessor for the rollback flag on the current connection",
   :name "rollback"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L138",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/throw-rollback",
   :namespace "clojure.contrib.sql.internal",
   :line 138,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([e]),
   :doc "Sets rollback and throws a wrapped exception",
   :name "throw-rollback"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L144",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/transaction*",
   :namespace "clojure.contrib.sql.internal",
   :line 144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([func]),
   :doc
   "Evaluates func as a transaction on the open database connection. Any\nnested transactions are absorbed into the outermost transaction. By\ndefault, all database updates are committed together as a group after\nevaluating the outermost body, or rolled back on any uncaught\nexception. If rollback is set within scope of the outermost transaction,\nthe entire transaction will be rolled back rather than committed when\ncomplete.",
   :name "transaction*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L98",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/with-connection*",
   :namespace "clojure.contrib.sql.internal",
   :line 98,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([db-spec func]),
   :doc
   "Evaluates func in the context of a new connection to a database then\ncloses the connection.",
   :name "with-connection*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/6a0483d9e216ca00fc648a4b3673996b76a2785a/src/main/clojure/clojure/contrib/sql/internal.clj#L178",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//sql-api.html#clojure.contrib.sql.internal/with-query-results*",
   :namespace "clojure.contrib.sql.internal",
   :line 178,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/sql/internal.clj",
   :var-type "function",
   :arglists ([[sql & params :as sql-params] func]),
   :doc
   "Executes a query, then evaluates func passing in a seq of the results as\nan argument. The first argument is a vector containing the (optionally\nparameterized) sql query string followed by values for any parameters.",
   :name "with-query-results*"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L18",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/attr",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 18,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([attrname] [loc attrname]),
   :doc
   "Returns the xml attribute named attrname, of the xml node at location loc.",
   :name "attr"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L23",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/attr=",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 23,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([attrname attrval]),
   :doc
   "Returns a query predicate that matches a node when it has an\nattribute named attrname whose value is attrval.",
   :name "attr="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L51",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/seq-test",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([preds]),
   :doc
   "Returns a query predicate that matches a node when its xml content\nmatches the query expresions given.",
   :name "seq-test"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L28",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/tag=",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 28,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([tagname]),
   :doc
   "Returns a query predicate that matches a node when its is a tag\nnamed tagname.",
   :name "tag="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L38",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/text",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 38,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns the textual contents of the given location, similar to\nxpaths's value-of",
   :name "text"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L46",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/text=",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 46,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a query predicate that matches a node when its textual\ncontent equals s.",
   :name "text="}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L57",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/xml->",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([loc & preds]),
   :doc
   "The loc is passed to the first predicate.  If the predicate returns\na collection, each value of the collection is passed to the next\npredicate.  If it returns a location, the location is passed to the\nnext predicate.  If it returns true, the input location is passed to\nthe next predicate.  If it returns false or nil, the next predicate\nis not called.\n\nThis process is repeated, passing the processed results of each\npredicate to the next predicate.  xml-> returns the final sequence.\nThe entire chain is evaluated lazily.\n\nThere are also special predicates: keywords are converted to tag=,\nstrings to text=, and vectors to sub-queries that return true if\nthey match.\n\nSee the footer of zip-query.clj for examples.",
   :name "xml->"}
  {:source-url
   "http://github.com/clojure/clojure-contrib/blob/b8d2743d3a89e13fc9deb2844ca2167b34aaa9b6/src/main/clojure/clojure/contrib/zip_filter/xml.clj#L80",
   :wiki-url
   "http://clojure.github.com/clojure-contrib//zip-filter-api.html#clojure.contrib.zip-filter.xml/xml1->",
   :namespace "clojure.contrib.zip-filter.xml",
   :line 80,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/clojure-contrib/src/src/main/clojure/clojure/contrib/zip_filter/xml.clj",
   :var-type "function",
   :arglists ([loc & preds]),
   :doc
   "Returns the first item from loc based on the query predicates\ngiven.  See xml->",
   :name "xml1->"})}