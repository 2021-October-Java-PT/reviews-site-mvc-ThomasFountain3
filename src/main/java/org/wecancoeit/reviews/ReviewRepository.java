package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();


    public ReviewRepository(){
        Review nba2k22 = new Review(1l, "NBA 2k22","images/Nba2k22.jpg", "Video games", "This games is my Achilles heal! Honestly one of the best 2k games ever created with the new NextGen gameplay functionality. 10 out of 10!", "10/10/21");
        Review madden22 = new Review(2l, "Madden 22","images/Madden22.jpg", "Video games", "The functionality in this game reminds me of the old Madden because they brought back the hit stick. Would've been my favorite until I saw who was on the cover. 9.5 out of 10!", "12/12/21");
        Review ufc4 = new Review(3l, "UFC 4","images/UFC4.jpg", "Video games", "This game is highly addictive, and you will find yourself putting someone in a submission hold for trying to get you off of it lol! 11 out of 10!", "08/15/20");
        Review gta5 = new Review(4l, "Grand Theft Auto 5","images/GTA5.jpg", "Video Games", "The games is not for the faint of heart, but has been known to reduce stress and anger levels in older teens and adults. 10 out of 10!", "02/24/21");

        reviewsList.put(nba2k22.getId(), nba2k22);
        reviewsList.put(madden22.getId(), madden22);
        reviewsList.put(ufc4.getId(), ufc4);
        reviewsList.put(gta5.getId(), gta5);
    }


    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOneReview(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAllReviews() {
        return reviewsList.values();
    }
}