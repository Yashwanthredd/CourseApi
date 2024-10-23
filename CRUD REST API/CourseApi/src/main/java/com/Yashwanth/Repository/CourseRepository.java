//package com.Yashwanth.Repository;
//
//public interface CourseRepositiory {
//
//}

package com.Yashwanth.Repository;

import com.Yashwanth.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // No additional methods are needed at this time.
}
