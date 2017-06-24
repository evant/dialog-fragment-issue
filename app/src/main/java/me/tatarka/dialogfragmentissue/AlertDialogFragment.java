package me.tatarka.dialogfragmentissue;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class AlertDialogFragment extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext(), getTheme())
                .setTitle("Dialog")
                .setMessage("This should stay on screen when you rotate")
                .create();
    }
}
