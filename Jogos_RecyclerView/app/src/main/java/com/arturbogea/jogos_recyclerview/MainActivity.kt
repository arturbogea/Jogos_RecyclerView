package com.arturbogea.jogos_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var list_jogos: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //Depois criar uma lista onde vai ser do tipo DadosJogos e vai passar os dados
        val jogosDados = listOf(DadosJogos(R.drawable.supermario,"Super Mario World", "Super Nintendo"),
            DadosJogos(R.drawable.zeldasnes,"The Legend of Zelda - A Link to the Past", "Super Nintendo"),
            DadosJogos(R.drawable.streetfighter,"Street fighter 2", "Super Nintendo"),
            DadosJogos(R.drawable.mortalkombat,"Ultimate Mortal Kombat 3", "Super Nintendo"),
            DadosJogos(R.drawable.topgear,"Top Gear", "Super Nintendo"),
            DadosJogos(R.drawable.zeldaocarina,"The Legend of Zelda: Ocarina of Time", "Nintendo 64"),
            DadosJogos(R.drawable.pokemonstadium,"Pokemon Stadium", "Nintendo 64"),
            DadosJogos(R.drawable.mariokart64, "Mario Kart 64", "Nintendo 64"),
            DadosJogos(R.drawable.smashbros,"Super Smash Bros", "Nintendo 64"),
            DadosJogos(R.drawable.pokemonsilver, "Pokemon Silver", "Game Boy Color"),
            DadosJogos(R.drawable.tekken, "Tekken 3", "PS1"),
            DadosJogos(R.drawable.yugioh, "Yu-Gi-Oh! Forbodden Memories", "PS1"),
            DadosJogos(R.drawable.godofwar1, "God of War", "PS2"),
            DadosJogos(R.drawable.godofwar2, "God of War 2", "PS2"),
            DadosJogos(R.drawable.resident4, "Resident Evil 4", "PS2"),
            DadosJogos(R.drawable.gtavice, "GTA - Vice City", "PS2"),
            DadosJogos(R.drawable.gtasanandreas, "GTA - San Andreas", "PS2"),
            DadosJogos(R.drawable.marvelcapcom, "Marvel vs Capcom 2", "PS2"),
            DadosJogos(R.drawable.needforspeed, "Need for Speed Most Wanted", "PS2"),
            DadosJogos(R.drawable.matrix, "Enter The Matrix", "PS2"),
            DadosJogos(R.drawable.reddead, "Red Dead Redemption", "Xbox360"),
            DadosJogos(R.drawable.gta5, "GTA 5", "Xbox 360"),
            DadosJogos(R.drawable.batmancity,"Batman Arkhan City", "Xbox 360"),
            DadosJogos(R.drawable.gearofwar, "Gears of War 3", "Xbox 360"),
            DadosJogos(R.drawable.batmanasilo, "Batman Arkham Asylum", "Xbox 360"),
            DadosJogos(R.drawable.alanwake,"Alan Wake", "Xbox 360"),
            DadosJogos(R.drawable.farcry, "Far Cry 5", "Xbox 360"),
            DadosJogos(R.drawable.zelda, "The Legend of Zelda: The Minish Cap", "Game Boy Advance"),
            DadosJogos(R.drawable.fifa19, "Fifa 2021", "Xbox 360"),
            DadosJogos(R.drawable.superstarsoccer, "International Superstar Soccer", "Super Nintendo"),
            DadosJogos(R.drawable.godofwar4, "God of War", "PS4"),
        )

        list_jogos = findViewById(R.id.listagem_jogos)

        list_jogos.adapter = JogosAdapter(jogosDados)

        list_jogos.layoutManager = GridLayoutManager(this, 2)
    }
}