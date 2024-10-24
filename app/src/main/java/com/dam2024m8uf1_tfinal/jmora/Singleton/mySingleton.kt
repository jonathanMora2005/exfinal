import android.os.Build
import androidx.annotation.RequiresApi
import com.dam2024m8uf1_tfinal.jmora.Superheroe
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
class mySingleton private constructor() {
    companion object {
        @Volatile
        private var instance: mySingleton? = null

        fun getInstance(): mySingleton {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = mySingleton()
                    }
                }
            }
            return instance!!
        }
    }
    public fun afaixisuper(s:Superheroe){
        superheros.add(s)
    }
    public var superheros: MutableList<Superheroe> = mutableListOf()

    init {
        superheros.add(
            Superheroe(
                name = "Spiderman",
                realName = "Peter Parker",
                age = 28,
                debutYear = LocalDate.of(1962, 8, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg",
                isAlien = false,
                power = 85.0,
                publisher = "Marvel",
                creator = "Stan Lee",
                numberOfComicsAppeared = 1500,
                cinematicUniverse = "Marvel Cinematic Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Daredevil",
                realName = "Matthew Michael Murdock",
                age = 30,
                debutYear = LocalDate.of(1964, 4, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg",
                isAlien = false,
                power = 75.0,
                publisher = "Marvel",
                creator = "Stan Lee",
                numberOfComicsAppeared = 800,
                cinematicUniverse = "Marvel Cinematic Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Wolverine",
                realName = "James Howlett",
                age = 137,
                debutYear = LocalDate.of(1974, 10, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg",
                isAlien = false,
                power = 90.0,
                publisher = "Marvel",
                creator = "Roy Thomas",
                numberOfComicsAppeared = 1000,
                cinematicUniverse = "X-Men Cinematic Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Batman",
                realName = "Bruce Wayne",
                age = 40,
                debutYear = LocalDate.of(1939, 5, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg",
                isAlien = false,
                power = 80.0,
                publisher = "DC",
                creator = "Bob Kane",
                numberOfComicsAppeared = 2000,
                cinematicUniverse = "DC Extended Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Thor",
                realName = "Thor Odinson",
                age = 1500,
                debutYear = LocalDate.of(1962, 8, 1),
                homePlanet = "Asgard",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg",
                isAlien = true,
                power = 95.0,
                publisher = "Marvel",
                creator = "Stan Lee",
                numberOfComicsAppeared = 1200,
                cinematicUniverse = "Marvel Cinematic Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Flash",
                realName = "Jay Garrick",
                age = 101,
                debutYear = LocalDate.of(1940, 1, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png",
                isAlien = false,
                power = 90.0,
                publisher = "DC",
                creator = "Gardner Fox",
                numberOfComicsAppeared = 1000,
                cinematicUniverse = "DC Extended Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Green Lantern",
                realName = "Alan Scott",
                age = 101,
                debutYear = LocalDate.of(1940, 7, 1),
                homePlanet = "Earth",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg",
                isAlien = false,
                power = 85.0,
                publisher = "DC",
                creator = "Bill Finger",
                numberOfComicsAppeared = 1200,
                cinematicUniverse = "DC Extended Universe",
                hasMovieAdaptation = true
            )
        )

        superheros.add(
            Superheroe(
                name = "Wonder Woman",
                realName = "Princess Diana",
                age = 3000,
                debutYear = LocalDate.of(1941, 12, 1),
                homePlanet = "Themyscira",
                urlImage = "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg",
                isAlien = false,
                power = 95.0,
                publisher = "DC",
                creator = "William Moulton Marston",
                numberOfComicsAppeared = 900,
                cinematicUniverse = "DC Extended Universe",
                hasMovieAdaptation = true
            ))
    }


}