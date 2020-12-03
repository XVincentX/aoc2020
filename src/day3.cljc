(ns day3)

(def input
  [(flatten (repeat [\. \. \. \. \# \. \. \. \# \# \. \. \. \. \. \. \# \# \. \. \# \. \. \# \. \# \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \# \# \# \# \# \. \. \. \# \. \. \. \. \. \. \# \. \. \. \. \# \. \. \# \. \# \# \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \. \# \# \. \. \. \. \. \. \# \. \# \. \. \# \. \. \# \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \. \. \. \. \# \. \# \. \. \# \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \. \. \# \# \. \. \# \# \# \. \. \. \# \. \# \. \. \# \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \# \# \. \. \. \# \# \# \. \. \. \# \. \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \# \. \. \. \# \. \. \. \. \. \. \# \# \. \# \. \# \. \. \# \. \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \# \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \# \# \. \# \. \# \#]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \# \. \# \. \# \# \. \# \. \. \. \. \# \. \. \# \. \. \# \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \# \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \# \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \. \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \# \. \# \. \# \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \# \# \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\# \# \# \. \# \. \. \. \. \. \. \# \. \# \. \# \. \# \. \. \# \. \. \. \. \# \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \# \# \. \. \. \. \. \. \# \. \# \. \. \. \# \. \. \. \# \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \# \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \# \. \. \# \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \# \. \# \. \# \. \. \# \. \. \. \# \# \# \. \. \. \. \. \. \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \# \. \. \# \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \# \# \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \# \# \. \. \. \. \. \# \. \. \. \# \. \. \. \# \# \. \. \# \. \# \# \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \# \. \# \# \. \. \. \. \# \. \. \. \. \. \# \# \. \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \# \# \. \# \. \. \. \. \# \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \# \# \. \. \. \. \. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \# \#]))
   (flatten (repeat [\. \. \. \. \# \# \. \# \. \. \. \. \. \# \. \. \# \. \# \# \. \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\# \. \. \. \# \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \# \# \.]))
   (flatten (repeat [\# \. \. \. \. \. \# \. \. \# \. \# \. \# \# \# \. \. \. \# \. \. \. \. \. \. \# \# \# \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \# \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \. \. \. \# \# \# \. \# \. \. \. \# \# \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \# \# \. \. \. \. \# \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \# \. \. \. \. \. \# \# \. \. \. \. \# \. \. \. \. \# \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \. \. \. \# \. \# \# \. \# \. \. \. \. \. \# \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \# \# \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \# \. \. \. \. \. \# \. \. \. \# \# \. \# \# \. \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \. \# \. \. \# \. \# \. \# \# \. \. \. \. \. \# \# \. \. \# \#]))
   (flatten (repeat [\. \. \# \# \# \. \. \. \. \# \. \. \# \. \# \# \. \. \. \. \. \. \. \. \# \# \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \# \. \. \# \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \# \. \# \. \. \. \# \. \. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \# \. \. \# \#]))
   (flatten (repeat [\. \# \. \. \# \. \# \. \. \. \# \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \# \. \# \#]))
   (flatten (repeat [\. \# \. \. \# \# \# \. \# \. \. \# \. \# \. \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \# \. \. \# \# \. \# \# \# \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\# \. \. \. \# \# \. \. \. \# \. \. \# \# \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \# \# \# \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \. \. \. \. \# \. \. \# \. \. \. \. \# \. \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \# \. \. \. \. \. \# \# \# \. \. \. \. \. \. \# \. \. \. \# \. \. \. \# \. \. \.]))
   (flatten (repeat [\# \. \# \# \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \# \. \# \. \. \# \# \. \. \. \# \. \# \. \# \. \. \. \# \# \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \# \# \. \. \# \. \# \. \. \# \. \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \# \. \# \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\# \. \# \. \. \# \. \. \. \. \# \. \. \. \# \# \. \# \# \# \. \. \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \# \. \. \# \. \. \. \# \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \. \# \. \. \. \. \# \# \# \. \. \. \# \. \# \. \# \. \. \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \# \# \. \. \# \# \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \. \# \. \. \. \# \# \# \# \. \. \. \# \# \. \. \. \. \# \# \# \# \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \. \# \. \# \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \# \# \. \. \# \. \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \# \. \# \. \# \# \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \. \# \. \. \. \# \# \. \# \# \. \. \. \. \# \. \# \. \# \. \# \# \# \. \# \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \# \. \. \. \. \# \. \# \. \. \. \# \# \. \. \. \# \. \. \. \. \# \# \#]))
   (flatten (repeat [\. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \# \# \# \# \# \. \. \# \. \. \# \# \. \. \. \. \. \. \. \# \. \# \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \# \# \. \. \# \. \. \. \# \# \# \. \. \. \. \# \. \. \# \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \. \# \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \. \. \. \. \. \. \# \. \. \# \. \. \. \# \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \# \# \. \. \. \# \. \# \. \. \# \# \. \. \. \. \. \# \. \. \# \.]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \. \. \. \. \. \. \# \# \# \# \. \# \# \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \# \. \. \# \. \# \# \. \. \# \# \. \. \. \. \# \. \. \# \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \. \# \# \. \# \. \# \. \# \# \. \. \# \. \. \# \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \#]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \# \# \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \# \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \# \. \# \. \# \# \. \. \. \. \# \. \. \. \. \# \. \. \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \# \# \# \. \# \. \. \. \. \# \. \. \# \. \. \# \. \. \# \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \. \# \. \. \. \. \. \. \. \. \# \# \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \# \# \# \# \. \# \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \. \# \# \. \# \. \. \. \. \. \# \. \. \. \. \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \# \. \. \# \. \# \. \# \. \. \. \# \. \. \. \. \. \# \. \# \# \# \. \. \# \.]))
   (flatten (repeat [\. \# \. \# \. \. \# \. \. \. \# \# \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\# \# \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \# \. \. \# \# \# \. \. \. \# \. \# \. \.]))
   (flatten (repeat [\# \# \. \# \# \# \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \# \# \# \. \# \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \# \. \. \# \# \. \. \. \. \# \. \# \. \. \. \# \. \. \. \# \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \. \# \. \# \# \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \# \. \. \# \. \# \. \. \. \. \. \. \# \# \. \# \. \. \. \# \. \# \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \# \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \# \# \. \#]))
   (flatten (repeat [\# \. \. \. \# \# \# \. \. \# \. \. \# \# \# \# \. \. \# \. \# \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \. \. \. \. \# \. \. \. \# \# \. \# \. \. \. \. \# \. \. \. \. \# \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \# \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \# \. \. \. \# \. \. \# \# \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \# \# \. \. \# \# \# \. \# \.]))
   (flatten (repeat [\# \. \. \. \# \# \# \. \. \. \# \. \# \# \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \# \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \. \# \. \# \. \. \. \#]))
   (flatten (repeat [\# \# \. \. \. \# \. \# \# \. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \# \. \# \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \# \# \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \# \. \. \. \. \# \. \# \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \# \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\# \# \. \. \. \# \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \# \. \. \. \# \. \. \. \. \# \. \# \. \. \. \. \. \. \# \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \# \. \# \. \. \. \. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \#]))
   (flatten (repeat [\. \# \# \. \# \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \# \. \# \.]))
   (flatten (repeat [\# \. \# \. \. \. \. \. \# \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \. \# \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \#]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \. \# \. \. \. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \# \# \. \# \#]))
   (flatten (repeat [\# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \# \# \. \# \# \. \# \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \# \# \# \. \# \. \.]))
   (flatten (repeat [\# \# \# \. \. \. \# \# \. \# \. \# \. \. \. \. \# \. \. \. \. \# \. \# \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \# \# \. \. \. \# \. \. \. \. \. \. \. \# \# \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \# \. \. \# \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \# \. \. \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \# \. \. \. \# \. \# \# \# \. \. \. \. \# \. \. \# \. \. \. \# \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \. \# \. \. \# \# \# \# \# \. \# \. \. \# \# \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \# \# \. \. \. \. \. \. \. \# \# \# \. \. \. \# \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \# \. \. \# \. \. \. \# \. \. \. \# \. \. \# \. \# \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \# \# \. \. \#]))
   (flatten (repeat [\. \# \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \# \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \# \. \. \. \. \# \. \# \. \# \# \# \# \# \. \. \. \. \. \# \. \. \. \# \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \# \# \. \. \. \. \. \. \. \# \. \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \# \# \# \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \# \. \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \# \# \. \. \# \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \# \. \. \. \. \# \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \# \# \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \# \# \. \. \# \. \# \. \# \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\# \# \# \. \# \. \. \# \. \# \. \. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \# \. \. \. \# \. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \# \. \# \# \. \. \. \. \.]))
   (flatten (repeat [\# \# \. \. \# \. \# \. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \. \# \. \. \. \. \. \. \. \. \# \# \. \# \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \# \. \. \. \# \# \# \. \. \. \. \# \. \# \. \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \# \# \# \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \. \# \# \. \. \. \. \. \. \# \. \. \# \# \. \. \# \# \. \. \. \# \# \. \#]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \# \. \. \# \. \. \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \# \# \. \. \. \. \. \. \# \# \# \# \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \# \# \# \# \# \. \# \. \# \. \. \# \. \. \# \. \. \# \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\# \# \. \# \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \. \# \. \. \. \# \# \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \# \. \# \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \# \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \# \#]))
   (flatten (repeat [\# \. \. \. \. \. \. \# \. \. \# \# \. \. \. \# \. \. \# \# \. \# \. \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \# \# \# \. \. \. \. \. \. \. \. \# \. \# \. \. \# \. \. \. \. \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \# \. \# \# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \# \. \# \. \.]))
   (flatten (repeat [\# \. \# \# \# \. \. \. \. \. \# \. \. \. \# \. \. \. \# \. \. \# \# \. \. \# \# \# \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \# \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \# \. \. \# \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \# \. \# \. \# \. \. \. \. \# \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \# \# \. \. \. \# \. \. \. \# \. \. \# \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \# \. \. \. \. \. \. \# \. \. \# \. \. \. \# \# \. \. \# \# \. \. \# \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \. \. \. \. \# \. \# \. \. \. \. \. \# \# \. \# \. \. \# \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \# \# \. \# \. \. \. \. \. \. \# \. \# \. \. \. \. \. \# \. \. \# \#]))
   (flatten (repeat [\. \# \. \. \# \# \. \. \. \. \# \# \. \. \. \. \# \. \# \. \. \. \# \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\# \. \# \. \# \# \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\. \# \. \# \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \# \# \# \. \# \. \. \. \. \. \. \. \. \. \. \# \. \# \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \# \# \. \# \. \. \# \. \. \. \# \# \. \. \# \. \# \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \# \. \. \. \. \. \. \. \# \. \# \#]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \# \. \# \# \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \. \. \. \# \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \# \# \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \# \# \. \. \. \. \. \. \. \# \. \. \. \# \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \# \. \. \# \. \. \.]))
   (flatten (repeat [\# \# \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \# \# \. \. \. \# \. \# \. \# \. \. \. \.]))
   (flatten (repeat [\# \# \. \. \# \# \. \# \. \. \# \. \. \# \. \. \. \. \. \# \. \# \# \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \# \. \. \. \. \# \. \# \. \# \. \. \. \. \# \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \# \# \. \. \. \# \. \# \# \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \# \# \. \. \# \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \# \. \. \# \. \# \. \. \. \# \. \. \. \. \. \. \. \# \. \. \# \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \. \. \. \# \# \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \.]))
   (flatten (repeat [\# \. \. \# \# \# \. \. \. \. \. \# \# \# \# \. \. \. \# \. \. \# \. \. \# \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \# \. \. \. \# \# \# \. \. \. \. \. \. \. \. \# \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \# \# \# \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \# \. \# \# \# \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \. \# \. \# \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \. \. \# \#]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \# \# \. \. \. \. \# \# \. \. \. \# \# \. \# \. \. \# \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \. \. \# \# \. \. \# \. \. \# \. \. \. \. \. \. \# \# \. \# \. \.]))
   (flatten (repeat [\. \# \. \# \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \# \#]))
   (flatten (repeat [\. \# \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \# \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \. \# \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \# \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \# \. \. \# \. \. \. \. \. \# \# \. \. \# \. \. \. \. \. \. \. \. \# \# \. \# \. \#]))
   (flatten (repeat [\# \# \. \. \# \. \# \. \. \. \. \# \. \. \. \. \# \# \. \. \. \. \. \. \. \# \# \# \. \. \#]))
   (flatten (repeat [\. \# \. \# \. \# \. \. \. \. \. \# \# \# \. \. \. \. \. \# \. \# \. \. \. \. \. \. \# \# \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \# \. \. \. \# \# \# \. \. \. \# \. \. \. \. \# \. \# \. \. \. \# \.]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \# \# \.]))
   (flatten (repeat [\# \. \. \. \# \. \. \. \. \# \. \# \. \. \. \# \# \# \. \. \. \. \. \. \. \# \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \# \. \#]))
   (flatten (repeat [\. \# \# \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \# \. \. \. \. \. \. \. \. \# \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \# \# \. \. \# \# \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \# \. \. \. \# \# \. \. \# \. \. \. \. \. \. \. \. \. \# \# \. \# \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \# \# \# \# \. \. \# \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \# \# \# \. \. \. \. \# \. \. \# \# \. \. \. \. \. \. \# \. \# \# \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \. \. \. \. \# \. \. \# \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \# \. \# \. \# \. \. \# \. \. \. \# \. \. \# \. \. \. \. \. \. \. \# \. \# \. \#]))
   (flatten (repeat [\# \. \# \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \. \. \# \# \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \# \. \. \# \# \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \# \# \. \. \# \. \. \. \. \. \# \. \. \# \. \. \# \. \# \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \# \. \. \# \. \# \. \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \# \. \. \# \. \. \. \. \# \# \. \. \. \# \# \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \. \. \. \. \. \# \. \. \. \# \# \. \. \# \. \# \# \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \. \. \. \. \. \. \# \. \# \. \. \. \. \# \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \# \. \# \. \. \. \. \. \# \# \# \. \. \. \# \. \. \. \. \. \. \. \# \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \# \. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \. \# \# \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \# \. \. \. \. \. \# \# \.]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \. \. \. \# \# \. \# \# \# \. \# \# \. \#]))
   (flatten (repeat [\. \# \. \# \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \# \. \. \# \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \# \# \# \# \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \# \. \# \. \. \# \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \# \. \# \. \. \. \# \# \. \. \. \. \. \# \. \# \. \. \. \. \. \. \. \# \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \# \. \# \# \. \# \. \. \. \. \. \. \. \# \# \# \. \. \. \. \# \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \# \. \# \. \# \. \.]))
   (flatten (repeat [\# \. \# \. \. \. \. \. \# \. \# \. \# \. \# \. \. \# \. \. \. \. \. \. \# \# \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \# \. \# \. \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \. \. \. \# \. \. \# \. \# \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \# \# \. \. \# \. \.]))
   (flatten (repeat [\. \# \. \# \. \. \# \. \. \. \. \# \. \. \. \. \. \# \. \. \# \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \. \# \. \. \. \. \# \# \. \. \# \# \. \# \. \. \# \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \# \# \. \. \# \# \# \. \. \. \. \. \# \# \. \. \. \. \# \. \# \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \# \. \. \. \. \# \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \# \# \. \# \. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \# \. \# \. \. \# \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \# \# \. \. \. \. \. \. \# \. \# \# \. \.]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\. \. \# \# \. \. \. \. \. \. \. \# \. \# \. \. \# \# \. \# \# \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \# \# \. \. \. \. \# \# \. \. \# \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \# \. \. \. \. \# \# \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \# \. \. \. \# \. \. \# \# \. \# \# \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \# \. \# \. \. \. \# \. \. \. \. \. \. \. \# \. \# \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \. \. \. \# \. \# \. \. \# \. \. \# \. \# \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \# \# \. \.]))
   (flatten (repeat [\# \. \# \. \. \# \. \# \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \# \. \. \# \# \. \. \# \. \# \# \. \. \# \# \# \. \. \. \# \. \# \. \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \. \# \. \# \. \. \# \. \. \. \# \. \. \. \. \# \. \# \# \. \. \. \. \. \# \.]))
   (flatten (repeat [\. \# \. \# \. \# \. \# \. \. \. \. \. \. \. \. \# \# \. \. \. \# \. \. \# \. \# \. \# \# \.]))
   (flatten (repeat [\. \# \. \. \# \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \# \# \. \# \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \# \. \. \. \# \. \# \. \. \. \# \. \. \. \# \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \. \# \# \. \# \. \.]))
   (flatten (repeat [\# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \# \. \. \. \. \. \# \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \# \. \# \. \# \# \. \# \. \. \. \. \# \. \. \#]))
   (flatten (repeat [\# \. \. \# \# \# \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \# \# \. \. \. \. \. \. \# \# \# \# \# \. \# \. \. \# \. \. \. \. \. \# \. \. \. \. \# \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \# \. \# \. \. \. \. \. \. \# \. \# \. \. \# \. \. \# \. \. \. \# \# \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \# \# \. \. \. \# \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \. \# \. \# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \# \. \. \# \# \. \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \# \# \. \# \. \. \. \. \. \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \# \. \. \. \. \# \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\# \. \. \. \# \# \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \. \. \. \. \. \# \# \. \. \# \. \# \# \. \# \. \. \# \. \# \. \#]))
   (flatten (repeat [\. \. \. \. \# \# \. \. \. \. \. \. \# \# \. \. \. \. \# \. \. \. \. \. \# \# \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \# \. \. \. \. \. \. \. \. \# \# \. \. \. \. \. \. \. \# \. \. \. \# \# \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \# \# \. \. \# \. \# \. \# \. \. \. \. \# \# \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \# \. \. \# \. \# \# \. \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \. \# \. \. \. \# \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \. \# \. \# \. \. \. \. \. \. \. \. \. \# \# \. \. \. \# \. \. \# \. \#]))
   (flatten (repeat [\. \. \. \. \. \# \. \. \# \# \# \# \. \. \. \. \# \. \# \# \. \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \. \# \. \. \. \# \. \# \. \. \. \. \# \. \. \. \. \. \# \. \. \# \. \. \. \. \. \# \#]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \# \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \# \. \. \# \# \. \. \# \. \# \. \# \. \. \. \# \# \# \. \. \. \#]))
   (flatten (repeat [\. \# \. \. \# \# \. \# \. \. \. \. \# \. \. \. \# \# \. \. \. \. \. \# \. \# \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \# \# \. \. \. \# \. \. \. \# \# \. \. \# \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \. \# \# \. \. \# \. \. \. \# \# \# \#]))
   (flatten (repeat [\# \. \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \#]))
   (flatten (repeat [\# \# \. \. \# \# \. \# \. \# \# \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \# \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \# \# \. \# \. \# \# \. \. \# \. \# \. \# \. \# \# \. \# \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \# \# \. \. \. \. \# \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \.]))
   (flatten (repeat [\# \. \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \# \. \. \. \# \# \# \. \.]))
   (flatten (repeat [\. \. \# \. \. \# \. \# \. \. \. \# \. \# \# \. \. \. \. \. \. \. \. \. \# \# \. \. \. \. \.]))
   (flatten (repeat [\. \. \# \. \. \. \# \# \. \. \# \. \. \. \. \. \. \. \. \# \. \. \# \. \# \# \. \. \# \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \# \# \# \. \. \. \# \. \. \# \. \. \. \. \# \. \. \# \. \# \# \# \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \. \# \# \. \# \# \# \. \. \. \. \. \# \# \. \# \. \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\# \. \. \. \. \# \. \. \# \# \# \. \. \# \. \. \. \. \. \. \. \# \. \# \. \# \. \. \# \. \.]))
   (flatten (repeat [\. \. \# \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \# \# \. \. \. \# \# \# \. \#]))
   (flatten (repeat [\. \# \. \# \. \. \# \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \# \. \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \# \# \. \. \. \# \. \. \# \. \. \. \# \#]))
   (flatten (repeat [\. \. \. \. \# \. \. \# \. \. \. \. \# \# \# \# \# \. \. \# \. \. \. \# \. \. \# \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \. \. \. \. \. \# \. \. \. \. \. \# \. \. \. \# \. \# \. \. \# \. \# \. \. \. \.]))
   (flatten (repeat [\. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \# \# \. \# \.]))
   (flatten (repeat [\. \. \. \# \# \. \. \. \. \. \. \. \# \. \# \. \. \. \. \. \# \# \. \. \. \. \. \. \# \. \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \# \. \. \# \. \# \# \. \. \# \# \# \. \. \. \# \. \# \.]))
   (flatten (repeat [\. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \. \. \. \. \. \. \. \. \# \. \. \. \# \. \. \#]))
   (flatten (repeat [\. \. \# \. \. \. \. \# \. \# \# \. \# \. \. \# \. \. \# \. \. \. \. \. \. \. \. \. \. \. \#]))
   (flatten (repeat [\. \. \# \. \. \. \. \. \# \# \. \. \. \# \. \. \. \. \. \. \# \. \. \. \# \. \. \. \. \. \.]))
   (flatten (repeat [\. \. \. \# \# \# \. \# \# \# \. \. \. \. \. \# \# \. \. \. \. \. \. \. \. \. \. \# \. \. \#]))])

(defn down-the-slope [increment acc val]
  (let [next-acc (update acc :index (partial + increment))
        element (nth val (:index acc))]
    (if (= \# element)
      (update next-acc :trees inc)
      next-acc)))

(def start-point {:index 0 :trees 0})

(*
 (:trees (reduce (partial down-the-slope 1) start-point input))
 (:trees (reduce (partial down-the-slope 3) start-point input))
 (:trees (reduce (partial down-the-slope 5) start-point input))
 (:trees (reduce (partial down-the-slope 7) start-point input))
 (:trees (reduce (partial down-the-slope 1) start-point (take-nth 2 input))))
