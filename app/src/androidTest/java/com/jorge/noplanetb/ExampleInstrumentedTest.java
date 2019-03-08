package com.jorge.noplanetb;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button botonLogin;
    private EditText user;
    private EditText password;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();
        user = actividad.findViewById(R.id.email);
        password = actividad.findViewById(R.id.password);
        botonLogin = actividad.findViewById(R.id.email_sign_in_button);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    private static final String USER = "JORGE@gmail.com";
    private static final String PASSWORD = "987sda687da";

    public void testLoginSignup() {

        // first tap on value1 entry
        TouchUtils.tapView(this, user);
        getInstrumentation().sendStringSync(USER);
        // now on value2 entry
        TouchUtils.tapView(this, password);
        getInstrumentation().sendStringSync(PASSWORD);
        // now on login button
        TouchUtils.tapView(this, botonLogin);

    }
}
