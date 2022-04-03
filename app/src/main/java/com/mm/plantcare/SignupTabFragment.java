package com.mm.plantcare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email, username, password, confirmPassword;
    Button signup;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.register_tab_fragment, container, false);

        email = root.findViewById(R.id.emailSign);
        username = root.findViewById(R.id.username);
        password = root.findViewById(R.id.pass);
        confirmPassword = root.findViewById(R.id.passConf);
        signup = root.findViewById(R.id.signupButton);

        email.setTranslationX(800);
        username.setTranslationX(800);
        password.setTranslationX(800);
        confirmPassword.setTranslationX(800);
        signup.setTranslationX(800);

        email.setAlpha(v);
        username.setAlpha(v);
        password.setAlpha(v);
        confirmPassword.setAlpha(v);
        signup.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        confirmPassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
