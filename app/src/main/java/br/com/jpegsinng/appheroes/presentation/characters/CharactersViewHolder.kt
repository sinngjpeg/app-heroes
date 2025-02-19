package br.com.jpegsinng.appheroes.presentation.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.jpegsinng.appheroes.R
import br.com.jpegsinng.appheroes.databinding.ItemCharacterBinding
import br.com.jpegsinng.core.model.Character
import com.bumptech.glide.Glide

class CharactersViewHolder(
    itemCharacterBinding: ItemCharacterBinding
) : RecyclerView.ViewHolder(itemCharacterBinding.root) {

    private val textName = itemCharacterBinding.textName
    private val imageCharacter = itemCharacterBinding.imageCharacter

    fun bind(character: Character) {
        textName.text = character.name
        Glide.with(itemView)
            .load(character.imageUrl)
            .fallback(R.drawable.ic_img_loading_error)
            .into(imageCharacter)
    }

    companion object {
        fun create(parent: ViewGroup): CharactersViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemCharacterBinding.inflate(inflater, parent, false)
            return CharactersViewHolder(itemBinding)
        }
    }
}
