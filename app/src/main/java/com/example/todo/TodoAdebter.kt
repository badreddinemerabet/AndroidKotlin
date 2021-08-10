package com.example.todo

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.items.view.*

class TodoAdebter
    (


    private val todos: MutableList<todo>
            ) : RecyclerView.Adapter<TodoAdebter.TodoViewHolder>()
{
        class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        val curTodo = todos[position]
        holder.itemView.apply {
            tvTodo.text = curTodo.title
            cbDone.isChecked = curTodo.isChaked
        }

    }

    override fun getItemCount(): Int {
        return todos.size
    }
}