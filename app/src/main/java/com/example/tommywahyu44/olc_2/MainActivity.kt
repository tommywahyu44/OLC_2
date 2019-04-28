package com.example.tommywahyu44.olc_2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.table_layout.*
import kotlinx.android.synthetic.main.table_row_layout.view.*

class MainActivity : AppCompatActivity() {

    lateinit var row: TableRow
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setContentView(R.layout.linear_layout);
        //        setContentView(R.layout.frame_layout);
                setContentView(R.layout.relative_layout);
        //        setContentView(R.layout.constraint_layout);
//        setContentView(R.layout.table_layout)
//        InsertRow("produk A", "2")
//        InsertRow("produk B", "4")

    }

    fun InsertRow(P1: String, P2: String) {
        row = layoutInflater.inflate(R.layout.table_row_layout, null) as TableRow
        row.TextTable.text = P1
        row.TextTable2.text = P2
        tableLayoutId.addView(row)
    }
}
