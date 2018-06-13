package poker.kata.domain

import poker.kata.enums.Rank
import poker.kata.enums.Suit

interface Board {
    val flop: Flop
    val turn: Card
    val river: Card
}

class FlopBoard(override val flop: Flop) : Board {
    override val turn: Card = Card(Suit.CLUBS, Rank.THREE)
    override val river: Card = Card(Suit.CLUBS, Rank.THREE)
}

class TurnBoard(override val flop: Flop, override val turn: Card) : Board {
    override val river: Card = Card(Suit.CLUBS, Rank.THREE)
}

class RiverBoard(override val flop: Flop, override val turn: Card, override val river: Card) : Board