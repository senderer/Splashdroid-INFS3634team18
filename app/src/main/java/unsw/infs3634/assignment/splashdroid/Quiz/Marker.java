package unsw.infs3634.assignment.splashdroid.Quiz;

import android.view.View;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * {@link FunctionalInterface} for marking {@link Question}s
 */
public interface Marker {

    /**
     * Called on the submission of a {@link Question}
     *
     * @param interactable The {@link View} containing the answers
     * @param score The score counter
     */
    void onSubmit(View interactable, AtomicInteger score);
}
