package com.example.password_validator;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.assertion.ViewAssertions.matches;


@RunWith(AndroidJUnit4.class)
public class ActivitTest{


    @ClassRule
    public ActivityTestRule  <MainActivity> MainActTestRule = new ActivityTestRule (MainActivity.class);

    //Test if the password could pass the validate,and check the strength..
    @Test
    public void activityLaunch() {

        // Perform an action: Perform a click or other action that triggers an event with the View.
        //Match a View: is used to Find a View.
        onView(withId(R.id.Password)).perform(clearText(), typeText("Jm636723"));
        onView(withId(R.id.Password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.Check)).check(matches(withText("Password passed the validate and it strong enough")));

        onView(withId(R.id.Password)).perform(typeText("jm6367"));
        onView(withId(R.id.Password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.Check)).check(matches(withText("Password does not pass the validate because the length is not enough")));

        onView(withId(R.id.Password)).perform(typeText("jm636723"));
        onView(withId(R.id.Password)).perform(closeSoftKeyboard());
        onView(withId(R.id.validate)).perform(click());
        onView(withId(R.id.Check)).check(matches(withText("Password does not pass the validate because it`s nto strong enough")));
    }
}
