package com.raivis.develops.mpi_prd2;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by raivis on 11/05/2016.
 */

//Just simple .java file for dialog
public class GroupInfoDialog extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //set array with possible values - to display, what is selected.
        final String[] groupMembers = getResources().getStringArray(R.array.group_members);
        //Create new alert dialog object - build on active activity.
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("5. Grupas dialoga logs");
        theDialog.setMultiChoiceItems(R.array.group_members, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {
                        if (isChecked) {
                            Toast.makeText(getActivity(),
                                    groupMembers[which] + getString(R.string.check),
                                    Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getActivity(),
                                    groupMembers[which] + getString(R.string.not_checked),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });

        //Now time to put some logic to negative and positive button of AlertDialog.
        theDialog.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //Using LENGTH_LONG to better take a picture! :)
                Toast.makeText(getActivity(), "Labi poga ..", Toast.LENGTH_LONG).show();
            }
        });

        //Almost the same thing for negative button
        theDialog.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "Atcelt poga ..", Toast.LENGTH_LONG).show();
            }
        });

        return theDialog.create();
    }
}
