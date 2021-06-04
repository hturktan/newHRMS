package kodlamaio.newHRMS.core.utilities.Cloudinary;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.newHRMS.core.utilities.results.DataResult;

public interface CloudinaryService {
	
	DataResult<Map> uploadImageFile(MultipartFile file);
}
