package kodlamaio.newHRMS.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.newHRMS.business.abstracts.CandidateImageService;
import kodlamaio.newHRMS.core.utilities.Cloudinary.CloudinaryService;
import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.Result;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessResult;
import kodlamaio.newHRMS.dataAccess.abstracts.CandidateImageDao;
import kodlamaio.newHRMS.entities.concretes.CandidateImage;

@Service
public class CandidateImageManager implements CandidateImageService {

	private CandidateImageDao candidateImageDao;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public CandidateImageManager(CandidateImageDao candidateImageDao, CloudinaryService cloudinaryService) {
		super();
		this.candidateImageDao = candidateImageDao;
		this.cloudinaryService = cloudinaryService;
	}
	
	public CandidateImageManager() {
		
	}

	@Override
	public Result add(CandidateImage candidateImage, MultipartFile imagaFile) {
		@SuppressWarnings("unchecked")
		Map<String, String> uploadImage = this.cloudinaryService.uploadImageFile(imagaFile).getData();
		candidateImage.setUrl(uploadImage.get("url"));
		this.candidateImageDao.save(candidateImage);
		return new SuccessResult("Image is added");
	}
	
	@Override
	public Result update(CandidateImage candidateImage) {
		this.candidateImageDao.save(candidateImage);
		return new SuccessResult("Image is updated");
	}

	@Override
	public Result delete(int candidateId) {
		this.candidateImageDao.deleteById(candidateId);
		return new SuccessResult("Image is deleted");
	}

	@Override
	public DataResult<List<CandidateImage>> getAll() {
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.findAll());
	}


	@Override
	public DataResult<List<CandidateImage>> getByCandidateId(int candidateId) {	
		
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.getByCandidateId(candidateId));
	}


}
