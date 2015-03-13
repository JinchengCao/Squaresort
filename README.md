# Squaresort
In my squaresort method, I used three loops to sort each row in an ascending order. 

Big-O analysis
As I mentioned before, the algorithm took O(mn^2 + nm^2) running time to finish.
Even when m and n stay the same, the elapsed time for each run varies a lot (±10000 in general), the data presented is about the average elapsed time for each run.

Theoretically, 3D plot of t(x,y) = x*y^2 + y*x^2 should look like the following graph.


![screen shot 2015-03-12 at 10 13 37 pm](https://cloud.githubusercontent.com/assets/8760999/6631974/40436666-c905-11e4-99b9-b0bc61341e81.png)
Fig1. 3D plot of function t(x,y) = x*y^2 + y*x^2


![screen shot 2015-03-12 at 10 13 46 pm](https://cloud.githubusercontent.com/assets/8760999/6631975/41dc2986-c905-11e4-8247-de4507105655.png)
Fig 2. Running time vs. m, n 3D plot for Namecomparator


![screen shot 2015-03-12 at 10 13 52 pm](https://cloud.githubusercontent.com/assets/8760999/6631976/434a0428-c905-11e4-8eb6-0c191618fc29.png)
Fig 3. Running time vs. m, n 3D plot for PayGradecomparator

