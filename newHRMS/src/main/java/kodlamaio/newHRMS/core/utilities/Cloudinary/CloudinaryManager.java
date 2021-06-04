package kodlamaio.newHRMS.core.utilities.Cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.newHRMS.core.utilities.results.DataResult;
import kodlamaio.newHRMS.core.utilities.results.ErrorDataResult;
import kodlamaio.newHRMS.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService {

	private Cloudinary cloudinary;

	
	public CloudinaryManager() {
	
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dtkwtgcfr",
				"api_key", "614996794524197",
				"api_secret", "ePVtG8k48g5_S5GZsJlc5tzVXKc"));;
	}

	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> result = (Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ErrorDataResult<Map>();
	}
}
