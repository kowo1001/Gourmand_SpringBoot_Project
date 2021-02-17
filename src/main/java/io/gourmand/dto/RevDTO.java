package io.gourmand.dto;

import java.time.LocalDate;
import java.util.List;

import io.gourmand.domain.Res;
import io.gourmand.domain.Review;
import io.gourmand.domain.ReviewImg;
import io.gourmand.domain.ReviewStandard;
import io.gourmand.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class RevDTO {
	
	//리뷰 조회
	@NoArgsConstructor
	@AllArgsConstructor
	@Setter
	@Getter
	@Builder
	public static class RevInfo {
		private Long reviewNum;
		private User user;
		private Res res;
		private String foodType;
		private String review;
		private LocalDate writeDate;
		private String imgLink;
		private ReviewStandard reviewStandard;
		private List<ReviewImg> reviewImg;
		
		
		public static RevInfo of(Review rev) {
			return RevInfo.builder()
					.reviewNum(rev.getReviewNum())
					.user(rev.getUser())
					.res(rev.getRes())
					.foodType(rev.getFoodType())
					.review(rev.getReview())
					.writeDate(rev.getWriteDate())
					.imgLink(rev.getImgLink())
					.reviewStandard(rev.getReviewStandard())
					.reviewImg(rev.getReviewImg())
					.build();
		}	
		
	}
		
	//리뷰 등록 
	@NoArgsConstructor
	@AllArgsConstructor
	@Setter
	@Getter
	@Builder
	public static class RevRegister {
		private User user;
		private Res res;
		private String foodType;
		private String review;
		private LocalDate writeDate;
		private String imgLink;
		private ReviewStandard reviewStandard;
		private List<ReviewImg> reviewImg;
		
		
		public static RevRegister toEntity(RevRegister rev) {
			return RevRegister.builder()
					.user(rev.getUser())
					.res(rev.getRes())
					.foodType(rev.getFoodType())
					.review(rev.getReview())
					.writeDate(rev.getWriteDate())
					.imgLink(rev.getImgLink())
					.reviewStandard(rev.getReviewStandard())
					.reviewImg(rev.getReviewImg())
					.build();
		}
	}
}
	