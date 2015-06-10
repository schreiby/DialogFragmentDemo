package com.example.ettie.dialogfragmentdemo;

/**
 * Created by Ettie on 6/10/2015.
 */

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity()).setTitle("Confirmation")
            .setMessage("Are you sure?")
            .setPositiveButton("Yes", pListener)
            .setNegativeButton("No", nListener);
    return alertDialogBuilder.create();
    }

    DialogInterface.OnClickListener pListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface arg0, int arg1) {
            //these will be executed when user clicks the Yes button
        }
    };

    DialogInterface.OnClickListener nListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface arg0, int arg1) {
            //these will be executed when user clicks the No button
        }
    };
}
