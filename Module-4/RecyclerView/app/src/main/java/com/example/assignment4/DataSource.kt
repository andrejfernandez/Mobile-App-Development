package com.example.assignment4
import com.example.assignment4.models.DexPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<DexPost>{
            val list = ArrayList<DexPost>()
            list.add(
                DexPost(
                    "#001 - Bulbasaur",
                    "Type - Grass, Poison\n" +
                            "Height - 2' 04\"\n" +
                            "Weight - 15.2 lbs",

                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png"
                )
            )

            list.add(
                DexPost(
                    "#002 - Ivysaur",
                    "Type - Grass, Poison\n" +
                            "Height - 3' 03\"\n" +
                            "Weight - 28.7 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png"
                )
            )

            list.add(
                DexPost(
                    "#003 - Venusaur",
                    "Type - Grass, Poison\n" +
                            "Height - 6' 07\"\n" +
                            "Weight - 220.5 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png"
                )
            )

            list.add(
                DexPost(
                    "#004 - Charmander",
                    "Type - Fire\n" +
                            "Height - 2' 00\"\n" +
                            "Weight - 18.7 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png"
                )
            )

            list.add(
                DexPost(
                    "#005 - Charmeleon",
                    "Type - Fire\n" +
                            "Height - 3' 07\"\n" +
                            "Weight - 41.9 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png"
                )
            )

            list.add(
                DexPost(
                    "#006 - Charizard",
                    "Type - Fire, Flying\n" +
                            "Height - 5' 07\"\n" +
                            "Weight - 199.5 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png"
                )
            )

            list.add(
                DexPost(
                    "#007 - Squirtle",
                    "Type - Water\n" +
                            "Height - 1' 08\"\n" +
                            "Weight - 19.8 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png"
                )
            )

            list.add(
                DexPost(
                    "#008 - Wartortle",
                    "Type - Water\n" +
                            "Height - 3' 03\"\n" +
                            "Weight - 49.6 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png"
                )
            )

            list.add(
                DexPost(
                    "#009 - Blastoise",
                    "Type - Water\n" +
                            "Height - 5' 03\"\n" +
                            "Weight - 188.5 lbs",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png"
                )
            )
            return list
        }
    }
}