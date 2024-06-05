/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.codething;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.Matchers.*;

class TrackerAppTest {
    @Test void appHasThings() {
        TrackerApp app = new TrackerApp();
        
        assertThat(app.totalActivities(), is(0));
        
        app.addActivity(new Running(1000, 30));
        assertThat(app.totalActivities(), is(1));
        app.addActivity(new Running(1000, 30));
        assertThat(app.totalActivities(), is(2));
        app.addActivity(new Running(1000, 30));
        assertThat(app.totalActivities(), is(3));
    }
    
    @Test void runningCalc() {
        Running activity = new Running(5000, 30);
        assertThat(activity.getCalories(), is(376L));
    }
    
    @Test void walkingCalc() {
    	Walking activity = new Walking(5000, 30);
        assertThat(activity.getCalories(), is(175L));
    }
    
    @Test void cyclingCalc() {
    	Cycling activity = new Cycling(5000, 30);
        assertThat(activity.getCalories(), is(225L));
    }
    
    @Test void swimmingCalc() {
    	Swimming activity = new Swimming(5000, 30);
        assertThat(activity.getCalories(), is(360L));
    }
    
    @Test void speedCalc() {
    	Running activity = new Running(5000, 30);
        assertThat(activity.getVelocity().doubleValue(), is(6.21));
    }
}
