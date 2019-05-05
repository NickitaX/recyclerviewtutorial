package nickshulhin.com.myrecyclerview.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import nickshulhin.com.myrecyclerview.R
import nickshulhin.com.myrecyclerview.data.Email

/**
 * Created by amazing nickshulhin on 5/5/19. Code should be amazing!
 */
class EmailAdapter(private val emailList: List<Email>, private val context: Context) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onBindViewHolder(emailViewHolder: EmailViewHolder, index: Int) {
        emailViewHolder.titleTextView.text = emailList[index].title
        emailViewHolder.descriptionTextView.text = emailList[index].description
        emailViewHolder.timeTextView.text = emailList[index].time
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        return EmailViewHolder(LayoutInflater.from(context).inflate(R.layout.email_item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.email_title)
        val descriptionTextView: TextView = view.findViewById(R.id.email_description)
        val timeTextView: TextView = view.findViewById(R.id.email_time)

    }
}