from imdbpie import Imdb
imdb = Imdb()
imdb = Imdb(anonymize=True)
var1 = imdb.top_250()
print(var1)