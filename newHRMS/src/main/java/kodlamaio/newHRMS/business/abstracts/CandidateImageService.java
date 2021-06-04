package kodlamaio.newHRMS.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.entities.concretes.CandidateImage;

public interface CandidateImageService {

	Result add(CandidateImage candidateImage, MultipartFile imageFile);
	Result update(CandidateImage candidateImage);
	Result delete(int candidateId);
	DataResult<List<CandidateImage>> getAll();
	DataResult<List<CandidateImage>> getByCandidateId(int candidateId);
	
}
