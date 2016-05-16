package com.raivis.develops.mpi_prd2;

import android.app.Dialog;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Dialogg extends DialogFragment{

        ArrayList mSelectedItems;


        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            mSelectedItems = new ArrayList();  // Where we track the selected items
            final String[] arrayElements = getResources().getStringArray(R.array.group_members);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            // Set the dialog title
            builder.setTitle("Virsraksts")
                    // Specify the list array, the items to be selected by default (null for none),
                    // and the listener through which to receive callbacks when items are selected
                    .setMultiChoiceItems(R.array.group_members, null,
                            new DialogInterface.OnMultiChoiceClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which,
                                                    boolean isChecked) {
                                    if (isChecked) {
                                        // If the user checked the item, add it to the selected items
                                        mSelectedItems.add(which);
                                        Toast.makeText(getActivity(),
                                                arrayElements[which] + getString(R.string.check),
                                                Toast.LENGTH_SHORT).show();
                                    } else if (mSelectedItems.contains(which)) {
                                        // Else, if the item is already in the array, remove it
                                        mSelectedItems.remove(Integer.valueOf(which));
                                        Toast.makeText(getActivity(),
                                                arrayElements[which] + getString(R.string.not_checked),
                                                Toast.LENGTH_LONG).show();
                                    }
                                }
                            })
                    .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getActivity(), "Labi poga ..",
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getActivity(), "Atcelt poga ..",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });

            return builder.create();
        }
}
