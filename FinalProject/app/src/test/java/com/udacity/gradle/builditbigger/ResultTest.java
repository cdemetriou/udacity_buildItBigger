package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by Matteo on 30/06/2015.
 */
public class ResultTest extends AndroidTestCase {

    public void NonEmtyTest() {
        String result = null;

        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
            endpointsAsyncTask.execute();
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
