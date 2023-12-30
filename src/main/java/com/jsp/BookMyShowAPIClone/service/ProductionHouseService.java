package com.jsp.BookMyShowAPIClone.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.BookMyShowAPIClone.Exception.OwnerIdNotFoundException;
import com.jsp.BookMyShowAPIClone.dao.OwnerDao;
import com.jsp.BookMyShowAPIClone.dao.ProductionHouseDao;
import com.jsp.BookMyShowAPIClone.dto.ProductionHouseDto;
import com.jsp.BookMyShowAPIClone.entity.Owner;
import com.jsp.BookMyShowAPIClone.entity.ProductionHouse;
import com.jsp.BookMyShowAPIClone.util.ResponseStructure;
@Service
public class ProductionHouseService {
	@Autowired
	private ProductionHouseDao houseDao;
	@Autowired
	private OwnerDao ownerDao;
	@Autowired
	private ModelMapper modelMapper;
	
	public ResponseEntity<ResponseStructure<ProductionHouse>> saveProductionHouse(long ownerId, ProductionHouseDto houseDto){
         Owner dbOwner =  ownerDao.findOwnerById(ownerId);
         
         if(dbOwner!=null)//ow ner exist and then we can establish production house
         {
//          production house to be established
      ProductionHouse house = this.modelMapper.map(houseDto, ProductionHouse.class);
      house.setOwner(dbOwner);
   ProductionHouse dbProductionHouse   = houseDao.saveProductionHouse(house);
   
   ResponseStructure<ProductionHouse> structure = new ResponseStructure<>();
   structure.setMessage("ProductionHouse Added Succesfully");
   structure.setStatus(HttpStatus.CREATED.value());
   structure.setData(dbProductionHouse);
   return new ResponseEntity<ResponseStructure<ProductionHouse>>(structure,HttpStatus.CREATED); 
   
   
   
        	 
        	 
         }
         else
         {
//         raise ownerIdNotFound Exception 
        	 throw new OwnerIdNotFoundException("Sorry failed to add production house"); 
         }
  }
}
